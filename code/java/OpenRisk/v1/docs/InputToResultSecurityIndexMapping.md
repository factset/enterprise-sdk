

# InputToResultSecurityIndexMapping

For each input holding from the request, a list of indices aligned to the input holding's IDs. These 0-based index values key into the security dimension of the results arrays and the `labels.security.ids` array.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolio** | **java.util.List&lt;Integer&gt;** | Index mapping corresponding to the input &#39;portfolio&#39; holdings | 
**benchmark** | **java.util.List&lt;Integer&gt;** | Index mapping corresponding to the input &#39;benchmark&#39; holdings |  [optional]
**market** | **java.util.List&lt;Integer&gt;** | Index mapping corresponding to the input &#39;market&#39; holdings |  [optional]


## Implemented Interfaces

* Serializable


