class DynamicArray {

    ArrayList<Integer> arrayList;
    int capacity;

    public DynamicArray(int capacity) {
        this.arrayList = new ArrayList<>(capacity);
        this.capacity = capacity;
    }

    public int get(int i) {
        return this.arrayList.get(i);
    }

    public void set(int i, int n) {
        this.arrayList.set(i,n);
    }

    public void pushback(int n) {
        if(capacity==arrayList.size()){
           resize();
        }
            arrayList.add(n);
    }

    public int popback() {
        return arrayList.remove(arrayList.size()-1);
    }

    private void resize() {
        capacity *= 2;
        ArrayList<Integer> resized = new ArrayList<>(capacity);
        resized.addAll(arrayList);
        arrayList = resized;
    }

    public int getSize() {
        return arrayList.size();
    }

    public int getCapacity() {
        return this.capacity;
    }
}
