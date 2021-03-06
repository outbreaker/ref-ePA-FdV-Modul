package de.gematik.ti.epa.fdv.gen.authorization;
//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 5.6.2.0
//
// Created by Quasar Development 
//
//---------------------------------------------------



import java.util.Hashtable;
import org.ksoap2.serialization.*;

public class X509DataType extends AttributeContainer implements KvmSerializable,java.io.Serializable
{
    
    public X509IssuerSerialType X509IssuerSerial;
    
    public byte[] X509SKI;
    
    public String X509SubjectName;
    
    public byte[] X509Certificate;
    
    public byte[] X509CRL;
    
    public java.util.ArrayList< PropertyInfo> any =new java.util.ArrayList< PropertyInfo>();
        
    private transient java.lang.Object __source;    
    

    
    
    public void loadFromSoap(java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
    {
        if (paramObj == null)
            return;
        AttributeContainer inObj=(AttributeContainer)paramObj;
        __source=inObj; 
        
        if(inObj instanceof SoapObject)
        {
            SoapObject soapObject=(SoapObject)inObj;
            int size = soapObject.getPropertyCount();
            for (int i0=0;i0< size;i0++)
            {
                PropertyInfo info=soapObject.getPropertyInfo(i0);
                if(!loadProperty(info,soapObject,__envelope))
                {
                    info= __envelope.getAny(info);
                    this.any.add(info);
                }
            } 
        }



    }

    
    protected boolean loadProperty(PropertyInfo info,SoapObject soapObject,ExtendedSoapSerializationEnvelope __envelope)
    {
        java.lang.Object obj = info.getValue();
        if (info.name.equals("X509IssuerSerial"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.X509IssuerSerial = (X509IssuerSerialType)__envelope.get(j,X509IssuerSerialType.class,false);
            }
            return true;
        }
        if (info.name.equals("X509SKI"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.X509SKI = Helper.getBinary(j,false);
            }
            return true;
        }
        if (info.name.equals("X509SubjectName"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.X509SubjectName = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.X509SubjectName = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("X509Certificate"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.X509Certificate = Helper.getBinary(j,false);
            }
            return true;
        }
        if (info.name.equals("X509CRL"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.X509CRL = Helper.getBinary(j,false);
            }
            return true;
        }
        return false;
    }
    
    public java.lang.Object getOriginalXmlSource()
    {
        return __source;
    }    
    

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return this.X509IssuerSerial!=null?this.X509IssuerSerial:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.X509SKI!=null?org.kobjects.base64.Base64.encode((byte[])this.X509SKI):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.X509SubjectName!=null?this.X509SubjectName:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.X509Certificate!=null?org.kobjects.base64.Base64.encode((byte[])this.X509Certificate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.X509CRL!=null?org.kobjects.base64.Base64.encode((byte[])this.X509CRL):SoapPrimitive.NullSkip;
        }
        if(propertyIndex>=5 && propertyIndex < 5+this.any.size())
        {
        return this.any.get(propertyIndex-(5)).getValue();
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 5+ any.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = X509IssuerSerialType.class;
            info.name = "X509IssuerSerial";
            info.namespace= "http://www.w3.org/2000/09/xmldsig#";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "X509SKI";
            info.namespace= "http://www.w3.org/2000/09/xmldsig#";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "X509SubjectName";
            info.namespace= "http://www.w3.org/2000/09/xmldsig#";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "X509Certificate";
            info.namespace= "http://www.w3.org/2000/09/xmldsig#";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "X509CRL";
            info.namespace= "http://www.w3.org/2000/09/xmldsig#";
        }
        if(propertyIndex>=5 && propertyIndex < 5+this.any.size())
        {
        PropertyInfo j=this.any.get(propertyIndex-(5));
        info.type = j.type;
        info.name = j.name;
        info.namespace= j.namespace;
        }
    }

    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
