package Arquivo;

public class Arquivo {
	
	 private byte r, w, e;
	    
	    public Arquivo(byte r, byte w, byte e){
	        
	        this.r = r;
	        this.w = w;
	        this.e = e;
	        
	    }
	    
	    public boolean isReadable(){
	        
	        if(r==1){
	            return true;
	        }
	        else{
	            return false;
	       
	        }
	    }
	    
	    public boolean isWriteable(){
	        
	        if(w==1){
	            return true;
	        }
	        else{
	            return false;
	       
	        }
	    }
	    
	    public boolean isExecutable(){
	       
	        if(e==1){
	            return true;
	        }
	        else{
	            return false;
	       
	        }
	    }
	    
	    public byte trocaRead(byte r){
	        
	        this.r= r;
	        return r;
	        
	    }
	    
	    public byte trocaWrite(byte w){
	        
	        this.w= w;
	        return w;
	        
	    }
	    
	    public byte trocaExecute(byte e){
	        
	        this.e= e;
	        return e;
	        
	    }
	    
	    public byte mostraEstado(){
	        
	        System.out.println("bit atual r: " + r);
	        System.out.println("bit atual w: " + w);
	        System.out.println("bit atual e: " + e);
	        System.out.println("Read: " +this.isReadable());
	        System.out.println("Write: " +this.isWriteable());
	        System.out.println("Execute: " +this.isExecutable());
	        return 0;
	        
	    }
	
}
