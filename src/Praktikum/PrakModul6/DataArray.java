package Praktikum.PrakModul6;

public class DataArray {
    private Mahasiswa[] mhs;
    private int nElemen;

    public DataArray (int max){
        mhs = new Mahasiswa[max];
        nElemen = 0;
    }

    public Mahasiswa find (long searchNim){
        int i;
        for (i = 0; i < nElemen; i++) {
            if (mhs[i].getNim() == searchNim) {
                break;
            }
        }
        if (i == nElemen){
            return null;
        } else {
            return mhs[i];
        }
    }

    public void insert (long nim, String nama, String asal){
        mhs[nElemen] = new Mahasiswa(nim, nama, asal);
        nElemen++;
    }

    public boolean delete(long searchNim){
        int i;
        for (i = 0; i < nElemen; i++) {
            if (mhs[i].getNim() == searchNim){
                break;
            }
        }
        if (i == nElemen){
            return false;
        } else {
            for (int j = i; j < nElemen; j++) {
                mhs[j] = mhs[j + 1];
            }
            nElemen--;
            return true;
        }
    }

    public void swap(int one, int two){
        Mahasiswa temp = mhs[one];
        mhs[one] = mhs[two];
        mhs[two] = temp;
    }

    public void ShellSortKnuthbyNIM(){
        int in, out;
        Mahasiswa temp;
        //penambahan
        int h = 0;
        h = 3 * h + 1;

        while (h > 0){
            for (out = h; out < nElemen; out++){
                temp = mhs[out];
                in = out;

                while (in > h - 1 && mhs[in - h].getNim() >= temp.getNim()){
                    mhs[in] = mhs[in -h];
                    in -= h;
                }
                mhs[in] = temp;
            }
            h /= 2;
        }
    }

    public void ShellSortKnuthbyNama(){
        int in, out;
        Mahasiswa temp;
        //penambahan
        int h = 0;
        h = 3 * h + 1;

        while (h > 0){
            for (out = h; out < nElemen; out++){
                temp = mhs[out];
                in = out;

                while (in > h - 1 && mhs[in - h].getNama().compareToIgnoreCase(temp.getNama()) > 0){
                    mhs[in] = mhs[in -h];
                    in -= h;
                }
                mhs[in] = temp;
            }
            h /= 2;
        }
    }

    //merge sort
    public void mergeSortbyNIM(){
        Mahasiswa[] workSpace = new Mahasiswa[nElemen];
        recMergeSortbyNIM(workSpace, 0, nElemen - 1);
    }

    public void recMergeSortbyNIM(Mahasiswa[] workSpace, int lowerBound, int upperBound){
        if (lowerBound == upperBound){
            return;
        } else {
            int mid = (lowerBound + upperBound) / 2;
            recMergeSortbyNIM(workSpace, lowerBound, mid);
            recMergeSortbyNIM(workSpace, mid + 1, upperBound);
            mergebyNIM(workSpace, lowerBound, mid + 1, upperBound);
        }
    }

    public void mergebyNIM(Mahasiswa[] workSpace, int lowIndex, int highIndex, int upperBound){
        int j = 0;
        int lowerBound = lowIndex;
        int mid = highIndex - 1;
        int nItem = upperBound - lowerBound + 1;

        while (lowIndex <= mid && highIndex <= upperBound){
            if (mhs[lowIndex].getNim() < mhs[highIndex].getNim()){
                workSpace[j++] = mhs[lowIndex++];
            } else {
                workSpace[j++] = mhs[highIndex++];
            }
        }

        while (lowIndex <= mid){
            workSpace[j++] = mhs[lowIndex++];
        }
        while (highIndex <= upperBound){
            workSpace[j++] = mhs[highIndex++];
        }
        for (j = 0; j < nItem ; j++) {
            mhs[lowerBound + j] = workSpace[j];
        }
    }

    public void mergeSortbyNama(){
        Mahasiswa[] workSpace = new Mahasiswa[nElemen];
        recMergeSortbyNama(workSpace, 0, nElemen - 1);
    }

    public void recMergeSortbyNama(Mahasiswa[] workSpace, int lowerBound, int upperBound){
        if (lowerBound == upperBound){
            return;
        } else {
            int mid = (lowerBound + upperBound) / 2;
            recMergeSortbyNama(workSpace, lowerBound, mid);
            recMergeSortbyNama(workSpace, mid + 1, upperBound);
            mergebyNama(workSpace, lowerBound, mid + 1, upperBound);
        }
    }

    public void mergebyNama(Mahasiswa[] workSpace, int lowIndex, int highIndex, int upperBound){
        int j = 0;
        int lowerBound = lowIndex;
        int mid = highIndex - 1;
        int nItem = upperBound - lowerBound + 1;

        while (lowIndex <= mid && highIndex <= upperBound){
            if (mhs[lowIndex].getNama().compareToIgnoreCase(mhs[highIndex].getNama()) < 0){
                workSpace[j++] = mhs[lowIndex++];
            } else {
                workSpace[j++] = mhs[highIndex++];
            }
        }

        while (lowIndex <= mid){
            workSpace[j++] = mhs[lowIndex++];
        }
        while (highIndex <= upperBound){
            workSpace[j++] = mhs[highIndex++];
        }
        for (j = 0; j < nItem ; j++) {
            mhs[lowerBound + j] = workSpace[j];
        }
    }

    public void QuickSortNIM(){
        recQuickSortNIM(0, nElemen -1);
    }

    public void recQuickSortNIM(int batasKiri, int batasKanan){
        if (batasKanan - batasKiri <= 0){
            return;
        } else {
            long pivot = mhs[batasKanan].getNim();
            int partisi = partitionItNIM(batasKiri, batasKanan, pivot);
            recQuickSortNIM(batasKiri, partisi - 1);
            recQuickSortNIM(partisi, batasKanan);
        }
    }

    public int partitionItNIM(int batasKiri, int batasKanan, long pivot){
        int indexKiri = batasKiri - 1;
        int indexKanan = batasKanan + 1;

        while (true){
            while (indexKiri < batasKanan && mhs[++indexKiri].getNim() < pivot);
            while (indexKanan > batasKiri && mhs[--indexKanan].getNim() > pivot);
            if (indexKiri >= indexKanan){
                break;
            } else {
                swap(indexKiri, indexKanan);
            }
        }
        return indexKiri;
    }
    public void QuickSortNama(){
        recQuickSortNama(0, nElemen -1);
    }

    public void recQuickSortNama(int batasKiri, int batasKanan){
        if (batasKanan - batasKiri <= 0){
            return;
        } else {
            String pivot = mhs[batasKanan].getNama();
            int partisi = partitionItNama(batasKiri, batasKanan, pivot);
            recQuickSortNama(batasKiri, partisi - 1);
            recQuickSortNama(partisi, batasKanan);
        }
    }

    public int partitionItNama(int batasKiri, int batasKanan, String pivot){
        int indexKiri = batasKiri - 1;
        int indexKanan = batasKanan + 1;

        while (true){
            while (indexKiri < batasKanan && mhs[++indexKiri].getNama().compareToIgnoreCase(pivot) < 0);
            while (indexKanan > batasKiri && mhs[--indexKanan].getNama().compareToIgnoreCase(pivot) > 0);
            if (indexKiri >= indexKanan){
                break;
            } else {
                swap(indexKiri, indexKanan);
            }
        }
        return indexKiri;
    }

    public void displayArray(){
        for (int i = 0; i < nElemen; i++) {
            mhs[i].displayMhs();
        }
    }
}