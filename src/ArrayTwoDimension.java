public class ArrayTwoDimension {

	public static void main(String[] args) {
        
		
		int [][]a = new int[2][3];
		
		a[0][0]=10;
		a[0][1]=25;
		a[0][2]=30;
		a[1][0]=49;
		a[1][1]=50;
		a[1][2]=60;
		
		//System.out.println(a.length);
		//System.out.println(a[0][1]);
		
		for (int i=0;i<a.length;i++) {
			for (int j=0 ; j<3;j++) {
				
				System.out.println(a[i][j]);
			
			
			if (a[i][j]%2 == 0) {
				System.out.println("True");
			}
			
			else {
				System.out.println("False");
			}
		}
		
	}

}
}
