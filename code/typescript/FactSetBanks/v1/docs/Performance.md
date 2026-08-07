# factsetbanks.Performance

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The identifier as submitted in the request (e.g., ticker or entity ID) | [optional] 
**fiscalEndDate** | **Date** | Fiscal period end date in YYYY-MM-DD format. | [optional] 
**currency** | **String** | Currency code (ISO 4217). For a list of currency codes, see [OA Page 1470](https://my.apps.factset.com/oa/pages/1470). | [optional] 
**peerGroupName** | **String** | Descriptive name of the FFIEC peer group. Peer groups are curated sets of similar banks used to benchmark how an institution performs relative to its peers.  | [optional] 
**peerGroupRank** | **Number** | The percentile ranking (0-99) of the institution within its peer group for a given ratio. | [optional] 
**entityProperName** | **String** | Institution legal name | [optional] 
**factsetEntityId** | **String** | FactSet entity identifier | [optional] 
**metric** | **String** | Metric code | [optional] 
**value** | **Number** | Metric value | [optional] 
**description** | **String** | Detailed description of the metric | [optional] 


