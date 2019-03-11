package br.edu.ifsp.spo.lp1a3.sp3013243.cap4;

public class Cripto {


    public Cripto (int toCripto) {
        this.toCripto=toCripto;
    }

	
    int toCripto;
    int pri;
    int seg;
    int ter;
    int qua;
    
    
    
    public int getToCripto() {
        return toCripto;
    }

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

    
    
    
    
    

    public void setToCripto(int toCripto) {
        this.toCripto = toCripto;
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
    
    
    
    
    

    public int cPri() {
    	
    	
        this.pri = toCripto / 1000;
        
        
        pri = (pri + 7) % 10;
        
        
        return pri;
    }


    public int cSeg() {
    	
        this.seg = toCripto / 100;
        
        seg = seg % 10;
        
        seg = (seg + 7) % 10;
        
        return seg;
    }
	
    public int cTer() {
    	
        this.ter = toCripto / 10;
        
        ter = ter % 10;
        
        ter = (ter + 7) % 10;
        
        return ter;
    }
    
    public int cQua() {
    	
        this.qua = toCripto % 10;
        
        qua = (qua + 7) % 10;
        
        return qua;
    }

	public void troca(int pri, int seg, int ter, int qua) {
		
		int aux;
		
		aux = this.pri;
		this.pri = this.ter;
		this.ter = aux;
		
		aux =this.seg;
		this.seg=this.qua;
		this.qua=aux;
		
		
	}
	
	
}
