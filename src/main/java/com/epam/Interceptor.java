package com.epam;

import javax.net.ssl.SSLSession;

import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpCoreContext;

public class Interceptor implements HttpResponseInterceptor
{
    @Override
    public void process(HttpResponse response, HttpContext context)
    {
        ManagedHttpClientConnection routedConnection = (ManagedHttpClientConnection) context
                .getAttribute(HttpCoreContext.HTTP_CONNECTION);
        System.err.println("============> Before stale check <===============");
        routedConnection.isStale();
        System.err.println("============> After stale check <===============");
        SSLSession sslSession = routedConnection.getSSLSession();
        sslSession.getProtocol();
    }
}
