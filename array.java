class array{
    public static void main(String[] args){
        int[] a = {12,3,34,6,8,56};
        int l=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>l){
                l=a[i];
            }
        }
        int S=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<l){
                S++;
            }
        }
        System.out.println("number of elements:"+S);
    }
}