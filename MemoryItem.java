import java.awt.Color;

public class MemoryItem
{
    public int size; //SIZE OF PAGE
    public Color color; //COLOR OF PAGE
    public int start; //START OF PAGE
    public int end; //END OF PAGE
    public int Page_Number; //PAGE NUMBER
    public int Current_Frame; // 
    
    public MemoryItem(int size,Color color,int page)
    {
        this.size = size;
        this.color = color;
        this.start = 0;
        this.end = start+size;
        this.Page_Number = page;
        this.Current_Frame = 0;
    }
    
    public void setSize(int newVal)
    {
        size = newVal;
    }
    
    public void setColor(Color color)
    {
        color = color;
    }
    
    public void setStart(int newStart)
    {
        start = newStart;
    }
    
    public void setEnd()
    {
        end = start + size;
    }
    
    public void setFrame(int frame)
    {
        Current_Frame=frame;
    }
    public int getSize()
    {
        return size;
    }
    
    public Color getColor()
    {
        return color;
    }
    
    public int getStart()
    {
        return start;
    }
    
    public int getEnd()
    {
        return end;
    }
    
    public int getPage()
    {
        return Page_Number;
    }
    
    public int getFrame()
    {
        return Current_Frame;
    }
    
    @Override
    public String toString()
    {
        return "Page Number: "+getPage()+"\n";
    }
    
}