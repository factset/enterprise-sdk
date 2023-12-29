# FactSet.SDK.FactSetConcordance.Model.PeopleDecisions
Concordance People Decisions object. Returned to show the Decision reached for each Entity. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ActiveRole** | **bool?** | If the role is active or not of the person. | [optional] 
**ClientEntity** | **string** | Name of the entity of the client.  | [optional] 
**ClientId** | **string** | Name of the column in the input file that contains a unique identifier supplied by the user. | [optional] 
**ClientFirstName** | **string** | First Name provided in the input file which is used in the &#x60;people-task&#x60; endpoint | [optional] 
**ClientLastName** | **string** | Last Name provided in the input file which is used in the &#x60;people-task&#x60; endpoint | [optional] 
**ClientMiddleName** | **string** | Middle Name provided in the input file which is used in the &#x60;people-task&#x60; endpoint | [optional] 
**ClientSalutation** | **string** | Salutation provided in the input file which is used in the &#x60;people-task&#x60; endpoint | [optional] 
**ClientSuffix** | **string** | Suffix provided in the input file which is used in the &#x60;people-task&#x60; endpoint | [optional] 
**ClientPriority** | **string** | Priority provided in the input file which is used in the &#x60;people-task&#x60; endpoint | [optional] 
**ClientPersonName** | **string** | The name provided by the client. | [optional] 
**ClientAdditionalContext** | **Dictionary&lt;string, string&gt;** | Any additional context column along with their values in the input file or single search.  To be used by Managed Service for any unmapped records.  | [optional] 
**Email** | **string** | The email address of the client. | [optional] 
**Entity** | **string** | Full name corresponding to the matched entity. | [optional] 
**MapStatus** | **string** | Concordance status of the submitted, where -    * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)   * UNMAPPED - The requested Entity Name is unmapped by FactSet.   * INDETERMINATE - The requested Entity Name has unable to make a mapping.  | [optional] 
**FirstName** | **string** | Name of the column in the input file that contains the first name. | [optional] 
**LastName** | **string** | Name of the column in the input file that contains the first name.  | [optional] 
**MiddleName** | **string** | Name of the column in the input file that contains the middle name.  | [optional] 
**PersonId** | **string** | The id of the person. | [optional] 
**Salutation** | **string** | The salutation is same as the normal salutation we use .The salutation can be Mr, Mrs.The salutation should not be given along with personName.  | [optional] 
**NameMatchSource** | **string** | Type of name that the nameMatchString matched.  | [optional] 
**NameMatchString** | **string** | String on which the Concordance algorithm mapped the submitted entity. | [optional] 
**PersonName** | **string** | Name of the column in the input file that contains the person name.  | [optional] 
**Suffix** | **string** | Name of the column in the input file that contains the person&#39;s suffix.  | [optional] 
**SimilarityScore** | **double?** | Probability of the match being similar to the entity requested as determined by the Concordance algorithm. A similarityScore of 1 is the highest level of similarity.  | [optional] 
**MatchFlag** | **bool** | Flag denoting if the row is a match.  | [optional] 
**RowIndex** | **int?** | Row number for match in the request or input file. | [optional] 
**TaskId** | **int?** | Identifier denoting a specific Concordance task submitted by the user. | [optional] 
**Title** | **string** | The title of the person. | [optional] 
**UniverseId** | **int?** | The universe identifier | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

