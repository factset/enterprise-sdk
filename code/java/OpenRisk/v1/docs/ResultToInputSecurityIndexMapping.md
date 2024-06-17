

# ResultToInputSecurityIndexMapping

For each input holding from the request, a list of indices aligned to the security dimension of the results arrays and the `labels.security.ids` array. These 0-based index values key into the input holding's IDs. Values less than 0 indicate result index not originating from corresponding holding.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolio** | **java.util.List&lt;Integer&gt;** | Index mapping corresponding to the input &#39;portfolio&#39; holdings | 
**benchmark** | **java.util.List&lt;Integer&gt;** | Index mapping corresponding to the input &#39;benchmark&#39; holdings |  [optional]
**market** | **java.util.List&lt;Integer&gt;** | Index mapping corresponding to the input &#39;market&#39; holdings |  [optional]


## Implemented Interfaces

* Serializable


