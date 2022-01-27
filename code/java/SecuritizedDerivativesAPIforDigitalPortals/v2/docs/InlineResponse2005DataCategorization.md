

# InlineResponse2005DataCategorization

Lists of categories of the securitized derivatives. Starting with the most coarse level (one), for each level of the category system, the list of categories of the securitized derivatives, matching the parameters, is returned. See endpoint `/category/listBySystem` for possible values.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ddv** | [**java.util.List&lt;InlineResponse2005DataCategorizationDdv&gt;**](InlineResponse2005DataCategorizationDdv.md) | Categorization based on the DDV (Deutscher Derivate Verband, German for German Derivatives Association) product classification. This category system (&#x60;id&#x3D;23&#x60;) covers securitized derivatives traded in Germany except exchange trade commodities (ETC) and exchange traded notes (ETN). |  [optional]
**eusipa** | [**java.util.List&lt;InlineResponse2005DataCategorizationDdv&gt;**](InlineResponse2005DataCategorizationDdv.md) | Categorization based on the EUSIPA (European Structured Investment Products Association) product classification. This category system (&#x60;id&#x3D;18&#x60;) covers all securitized derivatives. |  [optional]


## Implemented Interfaces

* Serializable


