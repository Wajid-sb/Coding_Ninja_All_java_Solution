public class solution {
    public static void marger(int a[],int b[],int input[]) {
		int i=0;
		int j=0;
		int k=0;
		while(i<a.length && j<b.length) {
			if(a[i]<=b[j]) {
				input[k]=a[i];
				i++;
				k++;
			}else {
				input[k]=b[j];
				j++;
				k++;
			}	
		}
		if(i<a.length) {
			while(i<a.length) {
			input[k]=a[i];
			k++;
			i++;
			}
		}
		if(j<b.length) {
			while(j<b.length) {
			input[k]=b[j];
			k++;
			j++;
			}
		}
	}

	public static void mergeSort(int[] input){
		// Write your code here
        if(input.length<=1) {
		return;
	}

    int l1[]=new int[input.length/2];       
    
    int l2[]=new int[input.length-l1.length];
	
    for(int i=0;i<input.length/2;i++){
        l1[i]=input[i];
    }
    for(int i=input.length/2;i<input.length;i++){
        l2[i-input.length/2]=input[i];
    }
    
    mergeSort(l1);
    mergeSort(l2);
    marger(l1,l2,input);
	}
}
