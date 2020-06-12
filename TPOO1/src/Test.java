
	public class Test { 
		public static void main (String[] args){
			try{
					tache();
					System.out.println ("je suis dans try de main()");
				}catch(ExceptionFilleFille e) {
					System.out.println("je suis dans catch1 de main()");
	
				}catch(ExceptionMere e){
					System.out.println ("je suis dans catch2 de main()");  
				}System.out.println ("je suis dans main() ");
		}
	//fin main()
		private static void tache() throws ExceptionMere{
			try{
				soustache();
			}catch(ExceptionFille e){ 
				System.out.println ("je suis dans catch de soustache");
				throw new ExceptionFilleFille();
				//System.out.println ("je suis encore dans catch de soustache");
				}
			}
		private static void soustache() throws ExceptionMere{
			throw new  ExceptionFille();
		}
	}