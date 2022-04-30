package com.portal.iterator;


public class PortalIterator
{
    String[] strArray;
  
    int ind = 0;
  
    public  PortalIterator (String[] strArray)
    {
        this.strArray = strArray;
    }
  
    public Object next()
    {
    	return (String) strArray[ind++];
    }
  
    public boolean hasNext()
    {
        if (ind >= strArray.length || 	strArray[ind] == null)
            return false;
        else
            return true;
    }
}