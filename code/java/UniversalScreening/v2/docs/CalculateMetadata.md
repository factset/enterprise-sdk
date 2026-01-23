

# CalculateMetadata

Generic options that can be applied to endpoint output.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sort** | **java.util.List&lt;String&gt;** | An array of parameter references to sort by to override the sort set in the screen document. Format is \&quot;#P.&lt;parameter_name&gt;\&quot; for ascending sort, \&quot;-#P.&lt;parameter_name&gt;\&quot; for descending. Will sort by references in order of appearance in the provided list, i.e. will sort first by the 0th reference, then the 1st reference and so on. Limit of 7 references. |  [optional]


## Implemented Interfaces

* Serializable


