package Arquivo;

public class Atv03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 1;
    	byte b = 0;
    	byte c = 1;
        Arquivo bytes0 = new Arquivo(a,b,c);
        bytes0.isReadable();
        bytes0.isWriteable();
        bytes0.isExecutable();
        bytes0.trocaRead((byte)0);
        bytes0.trocaWrite((byte)1);
        bytes0.trocaExecute((byte)0);
        bytes0.mostraEstado();

	}

}
