package type.union;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.ServiceClient;
import io.clientcore.core.http.exceptions.HttpResponseException;
import io.clientcore.core.http.models.RequestOptions;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.models.binarydata.BinaryData;
import type.union.implementation.SendRequest9;
import type.union.implementation.StringsOnliesImpl;

/**
 * Initializes a new instance of the synchronous UnionClient type.
 */
@ServiceClient(builder = UnionClientBuilder.class)
public final class StringsOnlyClient {
    @Metadata(generated = true)
    private final StringsOnliesImpl serviceClient;

    /**
     * Initializes an instance of StringsOnlyClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Metadata(generated = true)
    StringsOnlyClient(StringsOnliesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The get operation.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     prop: String(a/b/c) (Required)
     * }
     * }
     * </pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<GetResponse9> getWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getWithResponse(requestOptions);
    }

    /**
     * The send operation.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     prop: String(a/b/c) (Required)
     * }
     * }
     * </pre>
     * 
     * @param sendRequest9 The sendRequest9 parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> sendWithResponse(BinaryData sendRequest9, RequestOptions requestOptions) {
        return this.serviceClient.sendWithResponse(sendRequest9, requestOptions);
    }

    /**
     * The get operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Metadata(generated = true)
    public GetResponse9 get() {
        // Generated convenience method for getWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getWithResponse(requestOptions).getValue();
    }

    /**
     * The send operation.
     * 
     * @param prop The prop parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void send(GetResponseProp4 prop) {
        // Generated convenience method for sendWithResponse
        RequestOptions requestOptions = new RequestOptions();
        SendRequest9 sendRequest9Obj = new SendRequest9(prop);
        BinaryData sendRequest9 = BinaryData.fromObject(sendRequest9Obj);
        sendWithResponse(sendRequest9, requestOptions).getValue();
    }
}
