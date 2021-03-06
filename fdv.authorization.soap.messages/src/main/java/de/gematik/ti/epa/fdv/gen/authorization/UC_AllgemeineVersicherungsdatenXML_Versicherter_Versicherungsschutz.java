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

/**
* Es handelt sich um eine Pflichtangabe.
*/
public class UC_AllgemeineVersicherungsdatenXML_Versicherter_Versicherungsschutz extends AttributeContainer implements KvmSerializable,java.io.Serializable
{
    
	/**
	* Gibt den Beginn des Versicherungsschutzes (hier: Leistungsanspruch) des Versicherten bei dem unter Klasse Kostentraeger angegebenen Kostentraeger an.
	*/
    public String Beginn;
    
	/**
	* Gibt das Datum des Endes der Mitgliedschaft des Versicherten bei dem unter Klasse Kostentraeger angegebenen Kostentraeger an oder das Datum des Fristablaufs bei befristeter Gueltigkeit der Karte.
	* Dieses Feld ist ausschließlich für das beschriebene Datum zu nutzen (gemäß § 291 SGB V).
	*/
    public String Ende;
    
    public UC_AllgemeineVersicherungsdatenXML_Versicherter_Versicherungsschutz_Kostentraeger Kostentraeger;
        
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
        if (info.name.equals("Beginn"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.Beginn = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.Beginn = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("Ende"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.Ende = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.Ende = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("Kostentraeger"))
        {
            if(obj!=null)
            {
                java.lang.Object j = obj;
                this.Kostentraeger = (UC_AllgemeineVersicherungsdatenXML_Versicherter_Versicherungsschutz_Kostentraeger)__envelope.get(j,UC_AllgemeineVersicherungsdatenXML_Versicherter_Versicherungsschutz_Kostentraeger.class,false);
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
            return Beginn;
        }
        if(propertyIndex==1)
        {
            return this.Ende!=null?this.Ende:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return Kostentraeger;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 3;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Beginn";
            info.namespace= "http://ws.gematik.de/fa/vsdm/vsd/v5.2";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Ende";
            info.namespace= "http://ws.gematik.de/fa/vsdm/vsd/v5.2";
        }
        if(propertyIndex==2)
        {
            info.type = UC_AllgemeineVersicherungsdatenXML_Versicherter_Versicherungsschutz_Kostentraeger.class;
            info.name = "Kostentraeger";
            info.namespace= "http://ws.gematik.de/fa/vsdm/vsd/v5.2";
        }
    }

    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
