

# SecurityGroup

Security grouping definition to use in calculation and results. Multi-layer security groupings are also suppoted.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Optional name of the group |  [optional]
**indices** | **java.util.List&lt;Integer&gt;** | List of 0-based indices into the containing holding&#39;s security IDs array |  [optional]
**groups** | [**java.util.List&lt;SecurityGroup&gt;**](SecurityGroup.md) | Recursively defined elements; base case array (i.e., lowest security group) contains objects with &#39;indices&#39; only and not &#39;groups&#39; |  [optional]


## Implemented Interfaces

* Serializable


