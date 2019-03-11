package br.edu.ifsp.spo.lp1a3.sp3013243.cap4;

public class Descripto {
	
	public Descripto (int pri, int seg, int ter, int qua) {
        this.pri=pri;
        this.seg=seg;
        this.ter=ter;
        this.qua=qua;
     
    }

	
	
	int pri;
	int seg;
	int ter;
	int qua;
	
	
	

	    public int getPri() {
	        return pri;
	    }

	    public int getSeg() {
	        return seg;
	    }

	    public int getTer() {
	        return ter;
	    }

	    public int getQua() {
	        return qua;
	    }

	    
	    
	    

	    public void setPri(int pri) {
	        this.pri = pri;
	    }

	    public void setSeg(int seg) {
	        this.seg = seg;
	    }

	    public void setTer(int ter) {
	        this.ter = ter;
	    }

	    public void setQua(int qua) {
	        this.qua = qua;
	    }
	    
	
	    
	    public int dcPri() {
	    	
	    	this.pri = pri + 3;
	    	
	    	if(this.pri >= 10) {
	    		pri = pri - 10;
	    		
	    	}
	    	
	    	return pri;
	    }


	    public int dcSeg() {
	    	
	    	this.seg = seg + 3;
	    	
	    	if(this.seg >= 10) {
	    		seg = seg - 10;
	    		
	    	}
	    	
	    	return seg;
	    }
		
	    
	    public int dcTer() {
	    	
	    	this.ter = ter + 3;
	    	
	    	if(this.ter >= 10) {
	    		ter = ter - 10;
	    		
	    	}
	    	
	    	return ter;
	    }
	    
	    
	    public int dcQua() {
	    	
	    	this.qua = qua + 3;
	    	
	    	if(this.qua >= 10) {
	    		qua = qua - 10;
	    		
	    	}
	    	
	    	return qua;
	    }
	    
	    
	

	public void destroca(int pri, int seg, int ter, int qua) {
		
		int aux;
		
		aux = this.pri;
		this.pri = this.ter;
		this.ter = aux;
		
		aux =this.seg;
		this.seg=this.qua;
		this.qua=aux;
		
		
	}
}
