# FactSet.SDK.ProcuretoPaySCIM.Model.VermilionUserResourceName
The components of the user's real name. Providers MAY return just the full name as a single string in the formatted sub-attribute, or they MAY return just the individual component attributes using the other sub-attributes, or they MAY return both. If both variants are returned, they SHOULD be describing the same name, with the formatted name indicating how the component attributes should be combined.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Formatted** | **string** | The full name, including all middle names, titles, and suffixes as appropriate, formatted for display (e.g., &#39;Ms. Barbara J Jensen, III&#39;). | [optional] 
**FamilyName** | **string** | The family name of the User, or last name in most Western languages (e.g., &#39;Jensen&#39; given the full name &#39;Ms. Barbara J Jensen, III&#39;). | [optional] 
**GivenName** | **string** | The given name of the User, or first name in most Western languages (e.g., &#39;Barbara&#39; given the full name &#39;Ms. Barbara J Jensen, III&#39;). | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

