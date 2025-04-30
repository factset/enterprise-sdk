

# Partner

Partner object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Partner unique identifier, used in the request URL | 
**partnerPageUrl** | **String** | URL of the partner&#39;s page on the partner catalog. | 
**name** | **String** | Partner name | 
**logo** | **String** | Partner logo URL | 
**shortDescription** | **String** | Partner short description (plain text), appearing on the partner&#39;s card within the FactSet Partner Catalog. | 
**fullDescription** | **String** | Partner full description (HTML) | 
**workflow** | **java.util.List&lt;String&gt;** | An array of strings describing the Partner&#39;s workflow(s), used as categories on FactSet&#39;s Partner Catalog. | 
**type** | [**TypeEnum**](#TypeEnum) | Partner type, describing the Partner&#39;s relationship with FactSet | 
**videoUrl** | **String** | Partner video URL |  [optional]
**socialMedia** | [**PartnerSocialMedia**](PartnerSocialMedia.md) |  |  [optional]
**companyUrl** | **String** | Partner company URL |  [optional]
**address** | [**PartnerAddress**](PartnerAddress.md) |  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
CAPABILITYPARTNER | &quot;capabilityPartner&quot;
CONSULTANT | &quot;consultant&quot;
OPENFACTSETPARTNER | &quot;openFactSetPartner&quot;
DATAPARTNER | &quot;dataPartner&quot;
TECHNICALPARTNER | &quot;technicalPartner&quot;


## Implemented Interfaces

* Serializable


