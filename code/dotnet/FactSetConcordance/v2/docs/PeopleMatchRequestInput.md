# FactSet.SDK.FactSetConcordance.Model.PeopleMatchRequestInput

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PersonName** | **string** | The People name to match. | [optional] 
**ClientId** | **string** | A unique identifier supplied by the user. ClientId is saved to the user&#39;s Concordance universe and will be used as the identifier for that entity within the universe.  | [optional] 
**Salutation** | **string** | The salutation is same as the normal salutation we use .The salutation can be Mr, Mrs.The salutation should not be given along with personName.  | [optional] 
**FirstName** | **string** | The first name of the person. This field should not be given along with personName.  | [optional] 
**MiddleName** | **string** | The middle name of the person. This field should not be given along with personName.  | [optional] 
**LastName** | **string** | The last name of the person. This field should not be given along with personName.  | [optional] 
**AdditionalContext** | **Dictionary&lt;string, string&gt;** | Any additional context information along with other input values that need to be saved for an entity during search. To be used by Managed Service for any unmapped records.  This is applicable when saving the records with clientId and universeId specified.  | [optional] 
**Suffix** | **string** | The suffix of person&#39;s name. This field should not be given along with personName.  | [optional] 
**Entity** | **string** | The enity of the Person.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

