
public class ModuloTest {

	public static void main(String[] args) {
		System.out.println(1%5);
		int COLUMNS = 5;
		int row = 1;
        for (int i=0; i<14; i++) {

            if (i%COLUMNS==0 || i%COLUMNS==4) {
                System.out.println("Corner");
            } else if (i%COLUMNS==0 || i%COLUMNS==3) {
                System.out.println("middle");;
            }  else {
                System.out.println("Blank");
            }

//            row++;
        }
//        if (true) {
//			System.out.println("true");
//		}else if(true){
//			System.out.println("Second True");
//		}else{
//			System.out.println("Falase");
//		}
	}

}
