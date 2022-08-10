// Nama Program: Iterator Pattern
// Nama/NRP: 2072025/Sherly Santiadi

class ConcreteAggregate implements Aggregate{
    String[] tasks={"Memetik buah..","Mencuci buah..","Memotong buah..","Menyajikan buah.."};

    @Override
    public Iterator getIterator() {
        return new TaskIterator();
    }

    private class TaskIterator implements Iterator {
        int index = 0;

        @Override
        public boolean hasNext() {
            if (index < tasks.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return tasks[index++];
            }
            return null;
        }
    }}