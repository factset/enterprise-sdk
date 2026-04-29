# FactSet.SDK.FactSetFunds.Model.SimilarFunds
List of similar funds identified by their FactSet Permanent Security Identifiers

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**RequestId** | **string** | The requested Id sent as input. | [optional] 
**Error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**StructureType** | **SimilarFundsType** |  | 
**SimilarFundIds** | **List&lt;string&gt;** | Array of similar funds to the requestedId, each returned as a FactSet Permanent Security Identifier (XXXXXX-S). Data is returned for mutual funds only. This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

