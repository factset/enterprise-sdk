# GetSymbolType

Specifies the type of symbol being requested in the `ids` parameter. **This is only required when requesting to translate from the given symbolType to a FactSet Permanent Identifier. Only one symbolType is permitted per request, and all ids passed in request must be of the same type.**   |symbolType|Description|   |---|---|   |BIC|Bank Identification Codes|   |CIK|Edgar Central Index Key|   |CRD|Central Registration Depository|   |DUNS|Dun & Bradstreet Data Universal Numbering System|   |EIN|Employer Identification Number|   |FITCH|Fitch Ratings Identifier|   |LEI|Legal Entity Identifier|   |MD|Moody's Ratings Identifier|   |SPR|S&P Ratings Identifier|   |VALOREN|Valoren (\"Valor\") Identification|   |WKN|German Securities Identification (\"Wert\")|   |CRN|UK Company House Identifier|Entity(-E)|   |RSSD|Federal Reserve RSSD Identifier|Entity(-E)| 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **str** | Specifies the type of symbol being requested in the &#x60;ids&#x60; parameter. **This is only required when requesting to translate from the given symbolType to a FactSet Permanent Identifier. Only one symbolType is permitted per request, and all ids passed in request must be of the same type.**   |symbolType|Description|   |---|---|   |BIC|Bank Identification Codes|   |CIK|Edgar Central Index Key|   |CRD|Central Registration Depository|   |DUNS|Dun &amp; Bradstreet Data Universal Numbering System|   |EIN|Employer Identification Number|   |FITCH|Fitch Ratings Identifier|   |LEI|Legal Entity Identifier|   |MD|Moody&#39;s Ratings Identifier|   |SPR|S&amp;P Ratings Identifier|   |VALOREN|Valoren (\&quot;Valor\&quot;) Identification|   |WKN|German Securities Identification (\&quot;Wert\&quot;)|   |CRN|UK Company House Identifier|Entity(-E)|   |RSSD|Federal Reserve RSSD Identifier|Entity(-E)|  | defaults to "",  must be one of ["BIC", "CIK", "CRD", "DUNS", "EIN", "FITCH", "LEI", "MD", "SPR", "VALOREN", "WKN", "CRN", "RSSD", "", ]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


