# Batch

Enables the ability to asynchronously \"batch\" the request, supporting a long-running request up to 10 minutes. Upon requesting batch=Y, the service will respond back with an HTTP Status Code of 202. Once a batch request is submitted, use the `batch/v1/status` to see if the job has completed. Once completed, retrieve the results of the request via `batch/v1/result`. <p>**Additional Access Required. To gain access to this feature, reach out to your FactSet Account team or \"Report Issue\" above and our support teams can assist.** Upon requesting \"batch\": \"Y\", the service will respond back with an HTTP Status Code of 202. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **str** | Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request up to 10 minutes. Upon requesting batch&#x3D;Y, the service will respond back with an HTTP Status Code of 202. Once a batch request is submitted, use the &#x60;batch/v1/status&#x60; to see if the job has completed. Once completed, retrieve the results of the request via &#x60;batch/v1/result&#x60;. &lt;p&gt;**Additional Access Required. To gain access to this feature, reach out to your FactSet Account team or \&quot;Report Issue\&quot; above and our support teams can assist.** Upon requesting \&quot;batch\&quot;: \&quot;Y\&quot;, the service will respond back with an HTTP Status Code of 202.  | defaults to "N",  must be one of ["Y", "N", ]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


