# factsetconcordance.PeopleDecisions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activeRole** | **Boolean** | If the role is active or not of the person. | [optional] 
**clientEntity** | **String** | Name of the entity of the client.  | [optional] 
**clientId** | **String** | Name of the column in the input file that contains a unique identifier supplied by the user. | [optional] 
**clientFirstName** | **String** | First Name provided in the input file which is used in the &#x60;people-task&#x60; endpoint | [optional] 
**clientLastName** | **String** | Last Name provided in the input file which is used in the &#x60;people-task&#x60; endpoint | [optional] 
**clientMiddleName** | **String** | Middle Name provided in the input file which is used in the &#x60;people-task&#x60; endpoint | [optional] 
**clientSalutation** | **String** | Salutation provided in the input file which is used in the &#x60;people-task&#x60; endpoint | [optional] 
**clientSuffix** | **String** | Suffix provided in the input file which is used in the &#x60;people-task&#x60; endpoint | [optional] 
**clientPriority** | **String** | Priority provided in the input file which is used in the &#x60;people-task&#x60; endpoint | [optional] 
**clientPersonName** | **String** | The name provided by the client. | [optional] 
**email** | **String** | The email address of the client. | [optional] 
**entity** | **String** | Full name corresponding to the matched entity. | [optional] 
**mapStatus** | **String** | Concordance status of the submitted, where -    * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)   * UNMAPPED - The requested Entity Name is unmapped by FactSet.   * INDETERMINATE - The requested Entity Name has unable to make a mapping.  | [optional] 
**firstName** | **String** | Name of the column in the input file that contains the first name. | [optional] 
**lastName** | **String** | Name of the column in the input file that contains the first name.  | [optional] 
**middleName** | **String** | Name of the column in the input file that contains the middle name.  | [optional] 
**personId** | **String** | The id of the person. | [optional] 
**salutation** | **String** | The salutation is same as the normal salutation we use .The salutation can be Mr, Mrs.The salutation should not be given along with personName.  | [optional] 
**nameMatchSource** | **String** | Type of name that the nameMatchString matched.  | [optional] 
**nameMatchString** | **String** | String on which the Concordance algorithm mapped the submitted entity. | [optional] 
**personName** | **String** | Name of the column in the input file that contains the person name.  | [optional] 
**suffix** | **String** | Name of the column in the input file that contains the person&#39;s suffix.  | [optional] 
**similarityScore** | **Number** | Probability of the match being similar to the entity requested as determined by the Concordance algorithm. A similarityScore of 1 is the highest level of similarity.  | [optional] 
**matchFlag** | **Boolean** | Flag denoting if the row is a match.  | [optional] 
**rowIndex** | **Number** | Row number for match in the request or input file. | [optional] 
**taskId** | **Number** | Identifier denoting a specific Concordance task submitted by the user. | [optional] 
**title** | **String** | The title of the person. | [optional] 
**universeId** | **Number** | The universe identifier | [optional] 



## Enum: MapStatusEnum


* `MAPPED` (value: `"MAPPED"`)

* `UNMAPPED` (value: `"UNMAPPED"`)

* `INDETERMINATE` (value: `"INDETERMINATE"`)




