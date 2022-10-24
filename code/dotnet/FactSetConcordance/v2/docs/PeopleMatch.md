# FactSet.SDK.FactSetConcordance.Model.PeopleMatch
People Match object showing the decision reached for each Entity. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ActiveRole** | **string** | This tells whether the person is now active in the entity | [optional] 
**ClientEntity** | **string** | The entity for which the person is working.  | [optional] 
**ClientFirstName** | **string** | First Name provided in the input file which is used in the &#x60;people-task&#x60; endpoint | [optional] 
**ClientLastName** | **string** | Last Name provided in the input file which is used in the &#x60;people-task&#x60; endpoint | [optional] 
**ClientMiddleName** | **string** | Middle Name provided in the input file which is used in the &#x60;people-task&#x60; endpoint | [optional] 
**ClientSalutation** | **string** | Salutation provided in the input file which is used in the &#x60;people-task&#x60; endpoint | [optional] 
**ClientSuffix** | **string** | Suffix provided in the input file which is used in the &#x60;people-task&#x60; endpoint | [optional] 
**ClientPriority** | **string** | Priority provided in the input file which is used in the &#x60;people-task&#x60; endpoint | [optional] 
**ClientPersonName** | **string** | The person name as provided in request. | [optional] 
**FirstName** | **string** | The first name of the client. | [optional] 
**PersonId** | **string** | The id of the person. | [optional] 
**LastName** | **string** | The last name of the person. | [optional] 
**MiddleName** | **string** | The middle name of the client. | [optional] 
**Entity** | **string** | Full name corresponding to the matched entity. | [optional] 
**MapStatus** | **string** | Concordance status of the submitted, where -   * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)   * UNMAPPED - The requested Entity Name is unmapped by FactSet.   * INDETERMINATE - The requested Entity Name has unable to make a mapping.  | [optional] 
**MatchFlag** | **string** | Probability of the match being similar to the entity requested as determined by the Concordance algorithm. A similarityScore of 1 is the highest level of similarity.  | [optional] 
**NameMatchSource** | **string** | Additional statistic calculated by the algorithm that is used to ensure the validity of the match result. A confidenceScore of 1 is the highest level of confidence.  | [optional] 
**NameMatchString** | **string** | String on which the Concordance algorithm mapped the submitted entity. | [optional] 
**RowIndex** | **int?** | Country name corresponding to the location of the matched entity | [optional] 
**SimilarityScore** | **double?** | Probability of the match being similar to the entity requested as determined by the Concordance algorithm. A similarityScore of 1 is the highest level of similarity.  | [optional] 
**Title** | **string** | The title that the person is holding. | [optional] 
**UniverseId** | **int?** | The universe identifier | [optional] 
**TaskId** | **int?** | Identifier denoting a specific Concordance task submitted by the user. This value will be null for /people-match endpoint responses and is only available when using the \&quot;Bulk\&quot; workflow.  | [optional] 
**Suffix** | **string** | The suffix in the name of the person | [optional] 
**Salutation** | **string** | Title of a person&#39;s name | [optional] 
**PersonName** | **string** | Full name of the person matched | [optional] 
**Email** | **string** | Email of the person | [optional] 
**ClientId** | **string** | User defined person id provided when matched with FactSet person. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

