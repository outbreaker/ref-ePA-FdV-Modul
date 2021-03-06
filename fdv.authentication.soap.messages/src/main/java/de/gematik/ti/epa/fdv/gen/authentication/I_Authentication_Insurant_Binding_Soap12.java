package de.gematik.ti.epa.fdv.gen.authentication;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 5.6.2.0
//
// Created by Quasar Development 
//
//---------------------------------------------------





import org.ksoap2.HeaderProperty;
import org.ksoap2.serialization.*;
import org.kxml2.kdom.Element;

import java.util.ArrayList;
import java.util.List;


public class I_Authentication_Insurant_Binding_Soap12
{
    interface IWcfMethod
    {
        ExtendedSoapSerializationEnvelope CreateSoapEnvelope() throws java.lang.Exception;

        java.lang.Object ProcessResult(ExtendedSoapSerializationEnvelope __envelope,java.lang.Object result) throws java.lang.Exception;
    }

    String url="http://servicelocation/I_Authentication_Insurant";

    int timeOut=60000;
    public List< HeaderProperty> httpHeaders= new ArrayList< HeaderProperty>();
    public boolean enableLogging;
    public boolean createClassesForAny = false;

    public I_Authentication_Insurant_Binding_Soap12(){}

    public I_Authentication_Insurant_Binding_Soap12(String url)
    {
        this.url = url;
    }

    public I_Authentication_Insurant_Binding_Soap12(String url,int timeOut)
    {
        this.url = url;
        this.timeOut=timeOut;
    }

    protected org.ksoap2.transport.Transport createTransport()
    {
        try
        {
            java.net.URI uri = new java.net.URI(url);
            if(uri.getScheme().equalsIgnoreCase("https"))
            {
                int port=uri.getPort()>0?uri.getPort():443;
                return new com.easywsdl.exksoap2.transport.AdvancedHttpsTransportSE(uri.getHost(), port, uri.getPath(), timeOut);
            }
            else
            {
                return new com.easywsdl.exksoap2.transport.AdvancedHttpTransportSE(url,timeOut);
            }

        }
        catch (java.net.URISyntaxException e)
        {
        }
        return null;
    }

    protected ExtendedSoapSerializationEnvelope createEnvelope()
    {
        ExtendedSoapSerializationEnvelope envelope= new ExtendedSoapSerializationEnvelope(ExtendedSoapSerializationEnvelope.VER12);
        envelope.createClassesForAny = createClassesForAny;
        return envelope;
    }

    protected java.util.List sendRequest(String methodName,ExtendedSoapSerializationEnvelope envelope,org.ksoap2.transport.Transport transport ,com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile profile )throws java.lang.Exception
    {
        if(transport instanceof com.easywsdl.exksoap2.transport.AdvancedHttpTransportSE )
        {
            return ((com.easywsdl.exksoap2.transport.AdvancedHttpTransportSE)transport).call(methodName, envelope,httpHeaders,null,profile);
        }
        else
        {
            return ((com.easywsdl.exksoap2.transport.AdvancedHttpsTransportSE)transport).call(methodName, envelope,httpHeaders,null,profile);
        }
    }

    java.lang.Object getResult(java.lang.Class destObj,java.lang.Object source,String resultName,ExtendedSoapSerializationEnvelope __envelope) throws java.lang.Exception
    {
        if(source==null)
        {
            return null;
        }
        if(source instanceof SoapPrimitive)
        {
            SoapPrimitive soap =(SoapPrimitive)source;
            if(soap.getName().equals(resultName))
            {
                java.lang.Object instance=__envelope.get(source,destObj,false);
                return instance;
            }
        }
        else
        {
            SoapObject soap = (SoapObject)source;
            if (soap.hasProperty(resultName))
            {
                java.lang.Object j=soap.getProperty(resultName);
                if(j==null)
                {
                    return null;
                }
                java.lang.Object instance=__envelope.get(j,destObj,false);
                return instance;
            }
            else if( soap.getName().equals(resultName)) 
            {
                java.lang.Object instance=__envelope.get(source,destObj,false);
                return instance;
            }
        }

        return null;
    }

    
    public RequestSecurityTokenResponseType LoginCreateChallenge(final RequestSecurityTokenType RequestSecurityToken ) throws java.lang.Exception
    {
        com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile __profile = new com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile();
        __profile.Addressing = new com.easywsdl.exksoap2.ws_specifications.addressing.WS_Addressing();
        __profile.Addressing.To = url;
        __profile.Addressing.ReplyTo = "http://www.w3.org/2005/08/addressing/anonymous";
        __profile.Addressing.Action = "http://docs.oasis-open.org/ws-sx/ws-trust/200512/RST/Issue";
        __profile.Addressing.Enabled = true;
        return (RequestSecurityTokenResponseType)execute(new IWcfMethod()
        {
            @Override
            public ExtendedSoapSerializationEnvelope CreateSoapEnvelope(){
                ExtendedSoapSerializationEnvelope __envelope = createEnvelope();
                __envelope.addMapping("http://docs.oasis-open.org/ws-sx/ws-trust/200512","RequestSecurityToken",new RequestSecurityTokenType().getClass());
                __envelope.setOutputSoapObject(RequestSecurityToken);
                return __envelope;
            }
            
            @Override
            public java.lang.Object ProcessResult(ExtendedSoapSerializationEnvelope __envelope,java.lang.Object __result)throws java.lang.Exception {
                return (RequestSecurityTokenResponseType)getResult(RequestSecurityTokenResponseType.class,__result,"RequestSecurityTokenResponse",__envelope);
            }
        },"http://docs.oasis-open.org/ws-sx/ws-trust/200512/RST/Issue",__profile);
    }
    
    public RequestSecurityTokenResponseCollectionType LoginCreateToken(final RequestSecurityTokenResponseType RequestSecurityTokenResponse ) throws java.lang.Exception
    {
        com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile __profile = new com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile();
        __profile.Addressing = new com.easywsdl.exksoap2.ws_specifications.addressing.WS_Addressing();
        __profile.Addressing.To = url;
        __profile.Addressing.ReplyTo = "http://www.w3.org/2005/08/addressing/anonymous";
        __profile.Addressing.Action = "http://docs.oasis-open.org/ws-sx/ws-trust/200512/RSTR/ChallengeFinal";
        __profile.Addressing.Enabled = true;
        return (RequestSecurityTokenResponseCollectionType)execute(new IWcfMethod()
        {
            @Override
            public ExtendedSoapSerializationEnvelope CreateSoapEnvelope(){
                ExtendedSoapSerializationEnvelope __envelope = createEnvelope();
                __envelope.addMapping("http://docs.oasis-open.org/ws-sx/ws-trust/200512","RequestSecurityTokenResponse",new RequestSecurityTokenResponseType().getClass());
                __envelope.setOutputSoapObject(RequestSecurityTokenResponse);
                return __envelope;
            }
            
            @Override
            public java.lang.Object ProcessResult(ExtendedSoapSerializationEnvelope __envelope,java.lang.Object __result)throws java.lang.Exception {
                return (RequestSecurityTokenResponseCollectionType)getResult(RequestSecurityTokenResponseCollectionType.class,__result,"RequestSecurityTokenResponseCollection",__envelope);
            }
        },"http://docs.oasis-open.org/ws-sx/ws-trust/200512/RSTR/ChallengeFinal",__profile);
    }
    
    public RequestSecurityTokenResponseType RenewToken(final RequestSecurityTokenType RequestSecurityToken ) throws java.lang.Exception
    {
        com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile __profile = new com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile();
        __profile.Addressing = new com.easywsdl.exksoap2.ws_specifications.addressing.WS_Addressing();
        __profile.Addressing.To = url;
        __profile.Addressing.ReplyTo = "http://www.w3.org/2005/08/addressing/anonymous";
        __profile.Addressing.Action = "http://docs.oasis-open.org/ws-sx/ws-trust/200512/RST/Renew";
        __profile.Addressing.Enabled = true;
        return (RequestSecurityTokenResponseType)execute(new IWcfMethod()
        {
            @Override
            public ExtendedSoapSerializationEnvelope CreateSoapEnvelope(){
                ExtendedSoapSerializationEnvelope __envelope = createEnvelope();
                __envelope.addMapping("http://docs.oasis-open.org/ws-sx/ws-trust/200512","RequestSecurityToken",new RequestSecurityTokenType().getClass());
                __envelope.setOutputSoapObject(RequestSecurityToken);
                return __envelope;
            }
            
            @Override
            public java.lang.Object ProcessResult(ExtendedSoapSerializationEnvelope __envelope,java.lang.Object __result)throws java.lang.Exception {
                return (RequestSecurityTokenResponseType)getResult(RequestSecurityTokenResponseType.class,__result,"RequestSecurityTokenResponse",__envelope);
            }
        },"http://docs.oasis-open.org/ws-sx/ws-trust/200512/RST/Renew",__profile);
    }
    
    public RequestSecurityTokenResponseType LogoutToken(final RequestSecurityTokenType RequestSecurityToken ) throws java.lang.Exception
    {
        com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile __profile = new com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile();
        __profile.Addressing = new com.easywsdl.exksoap2.ws_specifications.addressing.WS_Addressing();
        __profile.Addressing.To = url;
        __profile.Addressing.ReplyTo = "http://www.w3.org/2005/08/addressing/anonymous";
        __profile.Addressing.Action = "http://docs.oasis-open.org/ws-sx/ws-trust/200512/RST/Cancel";
        __profile.Addressing.Enabled = true;
        return (RequestSecurityTokenResponseType)execute(new IWcfMethod()
        {
            @Override
            public ExtendedSoapSerializationEnvelope CreateSoapEnvelope(){
                ExtendedSoapSerializationEnvelope __envelope = createEnvelope();
                __envelope.addMapping("http://docs.oasis-open.org/ws-sx/ws-trust/200512","RequestSecurityToken",new RequestSecurityTokenType().getClass());
                __envelope.setOutputSoapObject(RequestSecurityToken);
                return __envelope;
            }
            
            @Override
            public java.lang.Object ProcessResult(ExtendedSoapSerializationEnvelope __envelope,java.lang.Object __result)throws java.lang.Exception {
                return (RequestSecurityTokenResponseType)getResult(RequestSecurityTokenResponseType.class,__result,"RequestSecurityTokenResponse",__envelope);
            }
        },"http://docs.oasis-open.org/ws-sx/ws-trust/200512/RST/Cancel",__profile);
    }
    
    public GetAuditEventsResponse GetAuditEvents(final java.lang.Object GetAuditEvents ) throws java.lang.Exception
    {
        com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile __profile = new com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile();
        __profile.Addressing = new com.easywsdl.exksoap2.ws_specifications.addressing.WS_Addressing();
        __profile.Addressing.To = url;
        __profile.Addressing.ReplyTo = "http://www.w3.org/2005/08/addressing/anonymous";
        __profile.Addressing.Action = "http://ws.gematik.de/fd/phrs/I_Authentication_Insurant/v1.1/GetAuditEvents";
        __profile.Addressing.Enabled = true;
        return (GetAuditEventsResponse)execute(new IWcfMethod()
        {
            @Override
            public ExtendedSoapSerializationEnvelope CreateSoapEnvelope(){
                ExtendedSoapSerializationEnvelope __envelope = createEnvelope();
                SoapObject __soapReq = new SoapObject("http://ws.gematik.de/fd/phrs/I_Authentication_Insurant/v1.1", "GetAuditEvents");
                __envelope.setOutputSoapObject(__soapReq);
                
                PropertyInfo __info=null;
                __info = new PropertyInfo();
                __info.namespace="http://ws.gematik.de/fd/phrs/I_Authentication_Insurant/v1.1";
                __info.name="GetAuditEvents";
                __info.type=PropertyInfo.STRING_CLASS;
                __info.setValue(GetAuditEvents!=null?GetAuditEvents:SoapPrimitive.NullNilElement);
                __soapReq.addProperty(__info);
                return __envelope;
            }
            
            @Override
            public java.lang.Object ProcessResult(ExtendedSoapSerializationEnvelope __envelope,java.lang.Object __result)throws java.lang.Exception {
                return (GetAuditEventsResponse)getResult(GetAuditEventsResponse.class,__result,"GetAuditEventsResponse",__envelope);
            }
        },"http://ws.gematik.de/fd/phrs/I_Authentication_Insurant/v1.1/GetAuditEvents",__profile);
    }

    protected java.lang.Object execute(IWcfMethod wcfMethod,String methodName,com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile profile) throws java.lang.Exception
    {
        org.ksoap2.transport.Transport __httpTransport=createTransport();
        __httpTransport.debug=enableLogging;
        ExtendedSoapSerializationEnvelope __envelope=wcfMethod.CreateSoapEnvelope();
        try
        {
            sendRequest(methodName, __envelope, __httpTransport,profile);
        }
        finally {
            if (__httpTransport.debug) {
                if (__httpTransport.requestDump != null) {
                    System.out.println("requestDump: "+__httpTransport.requestDump);

                }
                if (__httpTransport.responseDump != null) {
                    System.out.println("responseDump: "+__httpTransport.responseDump);
                }
            }
        }
        java.lang.Object __retObj = __envelope.bodyIn;
        if (__retObj instanceof org.ksoap2.SoapFault){
            org.ksoap2.SoapFault __fault = (org.ksoap2.SoapFault)__retObj;
            throw convertToException(__fault,__envelope);
        }else{
            return wcfMethod.ProcessResult(__envelope,__retObj);
        }
    }


    protected java.lang.Exception convertToException(org.ksoap2.SoapFault fault,ExtendedSoapSerializationEnvelope envelope)
    {
        org.ksoap2.SoapFault newException = fault;
                
        if(fault.detail!=null && fault.detail.getChildCount()>0)
        {
            Element detailsNode=(Element)fault.detail.getChild(0);
            try
            {
                SoapObject exceptionObject = null;
                exceptionObject=envelope.GetExceptionDetail(detailsNode,"http://ws.gematik.de/tel/error/v2.0","Error");
                if (exceptionObject != null)
                {
                    Error ex=new Error();
                    ex.loadFromSoap(exceptionObject,envelope);
                    newException = ex;
                }
            }
            catch (java.lang.Exception e)
            {
                e.printStackTrace();
            }
            newException.detail=fault.detail;
            newException.faultactor=fault.faultactor;
            newException.faultcode=fault.faultcode;
            newException.faultstring=fault.faultstring;
            newException.version=fault.version;
        }
        return newException;
    }
}


