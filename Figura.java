import java.awt.*;

public abstract class Figura
{
    protected Color cor;
    protected Color cor2;

    protected Figura ()
    {
        this (Color.BLACK, Color.WHITE);
        
    }
	  
    protected Figura (Color cor, Color cor2)
    {
        this.cor = cor;
        this.cor2 = cor2;
    }
	  
    public void setCor (Color cor)
    {
        this.cor = cor;
    }

    public void setCor2 (Color cor)
    {
        this.cor2 = cor;
    }
	  
    public Color getCor()
    {
    	return this.cor;
    }
    public Color getCor2()
    {
    	return this.cor2;
    }


  //public abstract boolean equals         (Object obj);
  //public abstract int     hashCode       ();
  //public abstract Object  clone          ();
    public abstract String  toString       ();
    public abstract void    torneSeVisivel (Graphics g);
}