package temp;


class Test{

public static void main( String [] args ) {

//      int i = 1, j = 10;
//
//      do {
//
//          if(  i > j ) break; // 1 10 2 9 3 8 (4 7)비교후 j = 6이 되었고 i = 5가 되어 비교 된 후 do-while문 종료함
//
//          j--;
//
//      } while( ++i < 5 ); //True가 되면 빠져나옴 
//
//           System.out.println("i="+i + " , j = " + j );
	
	


//	      int i = 0, j = 0;
//
//	      for( i = 0 ; i < 5 ; i++ ) {
//
//	         for( j = 0 ; j < 4 ; j++ ) {
//
//	             if( i == 2 && j == 1 ) break;
//
//	             if( i == 3 && j == 2 ) continue; //해당된 for문의 끝으로 이동 
//
//	         }
//
//	      }
//
//	           System.out.println("i = " + i + ", j = " +  j );
	
	int n = 1;
	  int sum = 0;
	  while( true ){
	     sum += n;
	     if ( n++   ==   10 ) break; //10이 되는 순간에 벗어나야함
	  }
	  System.out.println("SUM = " + sum );

	}

}


