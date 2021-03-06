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

public class SLIST_TS extends ANY implements KvmSerializable,java.io.Serializable
{
    
	/**
	* The origin of the list item value scale, i.e., the
	*                      physical quantity that a zero-digit in the sequence
	*                      would represent.
	*/
    public TS origin;
    
	/**
	* A ratio-scale quantity that is factored out of the
	*                      digit sequence.
	*/
    public PQ scale;
    
	/**
	* A sequence of raw digits for the sample values. This is
	*                      typically the raw output of an A/D converter.
	*/
    public String digits;
        

    
    
    @Override
    public void loadFromSoap(java.lang.Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
    {
        if (paramObj == null)
            return;
        AttributeContainer inObj=(AttributeContainer)paramObj;
        super.loadFromSoap(paramObj, __envelope);



    }

    @Override
    protected boolean loadProperty(PropertyInfo info,SoapObject soapObject,ExtendedSoapSerializationEnvelope __envelope)
    {
        java.lang.Object obj = info.getValue();
        if (info.name.equals("origin"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.origin = (TS)__envelope.get(j,TS.class,false);
            }
            return true;
        }
        if (info.name.equals("scale"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.scale = (PQ)__envelope.get(j,PQ.class,false);
            }
            return true;
        }
        if (info.name.equals("digits"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.digits = j.toString();
                    }
                }
                else{
                    this.digits = obj.toString();
                }
            }
            return true;
        }
        return super.loadProperty(info,soapObject,__envelope);
    }
    
    

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        int count = super.getPropertyCount();
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==count+0)
        {
            return origin;
        }
        if(propertyIndex==count+1)
        {
            return scale;
        }
        if(propertyIndex==count+2)
        {
            return digits;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+3;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = TS.class;
            info.name = "origin";
            info.namespace= "urn:hl7-org:v3";
        }
        if(propertyIndex==count+1)
        {
            info.type = PQ.class;
            info.name = "scale";
            info.namespace= "urn:hl7-org:v3";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "digits";
            info.namespace= "urn:hl7-org:v3";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }

    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
