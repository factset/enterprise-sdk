# factsetconcordance.PeopleMatchRequestInput

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**personName** | **String** | The People name to match. | [optional] 
**clientId** | **String** | A unique identifier supplied by the user. ClientId is saved to the user&#39;s Concordance universe and will be used as the identifier for that entity within the universe.  | [optional] 
**salutation** | **String** | The salutation is same as the normal salutation we use .The salutation can be Mr, Mrs.The salutation should not be given along with personName.  | [optional] 
**firstName** | **String** | The first name of the person. This field should not be given along with personName.  | [optional] 
**middleName** | **String** | The middle name of the person. This field should not be given along with personName.  | [optional] 
**lastName** | **String** | The last name of the person. This field should not be given along with personName.  | [optional] 
**additionalContext** | **{String: String}** | Any additional context information along with other input values that need to be saved for an entity during search. To be used by Managed Service for any unmapped records.  This is applicable when saving the records with clientId and universeId specified.  | [optional] 
**suffix** | **String** | The suffix of person&#39;s name. This field should not be given along with personName.  | [optional] 
**entity** | **String** | The enity of the Person.  | [optional] 


