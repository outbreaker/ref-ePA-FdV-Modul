package de.gematik.ti.epa.fdv.gen.authentication;
//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 5.6.2.0
//
// Created by Quasar Development 
//
//---------------------------------------------------



import org.ksoap2.serialization.*;

/**
* This type is used for password elements per Section 4.1.
*/
public class PasswordString extends AttributedString implements java.io.Serializable
{
    
    public String Type;
        

    
    
    @Override
    public void loadFromSoap(java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
    {
        if (paramObj == null)
            return;
        AttributeContainer inObj=(AttributeContainer)paramObj;
        super.loadFromSoap(paramObj, __envelope);

if (inObj.hasAttribute("Type"))
        {	
            java.lang.Object j = inObj.getAttribute("Type");
            if (j != null)
            {
                Type = j.toString();
            }
        }

    }

    @Override
    protected boolean loadProperty(PropertyInfo info,SoapObject soapObject,ExtendedSoapSerializationEnvelope __envelope)
    {
        java.lang.Object obj = info.getValue();
        return super.loadProperty(info,soapObject,__envelope);
    }
    
    
    @Override
    public Object getSimpleValue()
    {
        SoapPrimitive primitive =(SoapPrimitive)super.getSimpleValue();
        
        if (this.Type != null)
        {
            AttributeInfo attrInfo = new AttributeInfo();
            attrInfo.setName("Type");
            attrInfo.setValue(this.Type);
            attrInfo.setNamespace("");
            primitive.addAttribute(attrInfo);
        }
        return primitive;
    }    
}
