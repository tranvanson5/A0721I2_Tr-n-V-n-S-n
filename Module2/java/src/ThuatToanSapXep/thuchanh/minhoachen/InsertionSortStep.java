package ThuatToanSapXep.thuchanh.minhoachen;

class InsertionSortStep {
    static int[]list={10,2,3,43,2,32,4,2,6,7,4,23,4};
    public static void insertionSort(int[] list){
        int length = list.length;
        int x,pos;
        System.out.println(list[0]);
        for (int i=1 ;i<length ;i++){
            x= list[i];
            pos=i;
            while(pos>0&&x<list[pos-1]){
                list[pos]=list[pos-1];
                pos--;
            }

            list[pos]=x;
            for (int j = 0; j <= i; j++)
                System.out.print(list[j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
        insertionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
