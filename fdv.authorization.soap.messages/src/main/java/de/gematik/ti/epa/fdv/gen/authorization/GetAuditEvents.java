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

public class GetAuditEvents extends AttributeContainer implements KvmSerializable,java.io.Serializable
{
    
    public RecordIdentifierType RecordIdentifier;
    
    public DeviceIdType DeviceID;
        
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
                }
            } 
        }



    }

    
    protected boolean loadProperty(PropertyInfo info,SoapObject soapObject,ExtendedSoapSerializationEnvelope __envelope)
    {
        java.lang.Object obj = info.getValue();
        if (info.name.equals("RecordIdentifier"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.RecordIdentifier = (RecordIdentifierType)__envelope.get(j,RecordIdentifierType.class,false);
            }
            return true;
        }
        if (info.name.equals("DeviceID"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.DeviceID = (DeviceIdType)__envelope.get(j,DeviceIdType.class,false);
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
            return RecordIdentifier;
        }
        if(propertyIndex==1)
        {
            return DeviceID;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 2;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = RecordIdentifierType.class;
            info.name = "RecordIdentifier";
            info.namespace= "http://ws.gematik.de/fd/phrs/AuthorizationService/v1.1";
        }
        if(propertyIndex==1)
        {
            info.type = DeviceIdType.class;
            info.name = "DeviceID";
            info.namespace= "http://ws.gematik.de/fd/phrs/AuthorizationService/v1.1";
        }
    }

    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
