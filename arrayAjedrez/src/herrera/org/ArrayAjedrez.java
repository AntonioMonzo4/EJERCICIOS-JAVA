package herrera.org;

public class ArrayAjedrez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char array[][]=new char[8][8];
		char figuras[]= {'\u2659',0x2656,0x2658,0x2657,0x2655,0x265F,0x265B,0x265C,0x265E,0x265D,0x2654,0x265A};

		for(int i =0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
			array[i][j]=figuras[(int)(Math.random()*figuras.length)];
			}
		}
		for(int i =0;i<8;i++) {
			for(int j=0;j<8;j++) {
				if(j<7) {
					System.out.print(array[i][j]+" ");
				}else if(j==7){
					System.out.println(array[i][j]);
	
				
			}
		}

	}

	}
}
