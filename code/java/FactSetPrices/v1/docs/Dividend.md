

# Dividend


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. |  [optional]
**divsExDate** | **LocalDate** | Ex-Date of the dividend expressed in YYYY-MM-DD format. |  [optional]
**adjDate** | **LocalDate** | Date of last split for which prices and volume have been adjusted. |  [optional]
**currency** | **String** | Currency ISO code. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). |  [optional]
**divsPaid** | **Double** | Amount of the dividend paid. |  [optional]
**divsRecDate** | **LocalDate** | Date the dividend was recorded expressed in YYYY-MM-DD format. |  [optional]
**divsPayDate** | **LocalDate** | Date the dividend will be paid expressed in YYYY-MM-DD format. |  [optional]
**divsTypeC** | **Integer** | Dividend type code. For code descriptions, visit [Online Assistant Page #8764](https://oa.apps.factset.com/pages/8764). |  [optional]
**divsTypeD** | **String** | Description of dividend type. For type descriptions, visit [Online Assistant Page #8764](https://oa.apps.factset.com/pages/8764). |  [optional]
**divsTaxC** | **String** | Tax Marker Code. For code descriptions, visit [Online Assistant Page #15265](https://oa.apps.factset.com/pages/15265). |  [optional]
**divsTaxD** | **String** | Description of Tax Marker. For type descriptions, visit [Online Assistant Page #15265](https://oa.apps.factset.com/pages/15265). |  [optional]
**divsNGFlag** | [**DivsNGFlagEnum**](#DivsNGFlagEnum) | Net/Gross Marker Code. For details describing Net vs. Gross dividends, visit [Online Assistant Page #11512](https://oa.apps.factset.com/pages/11512). |  [optional]
**divsNGEquiv** | **Double** | Net/Gross equivalent (opposite of dividend paid). For details describing Net vs. Gross dividends, visit [Online Assistant Page #11512](https://oa.apps.factset.com/pages/11512). |  [optional]
**requestId** | **String** | Identifier that was used for the request. |  [optional]



## Enum: DivsNGFlagEnum

Name | Value
---- | -----
N | &quot;N&quot;
G | &quot;G&quot;
T | &quot;T&quot;
X | &quot;X&quot;
V | &quot;V&quot;
_0 | &quot;0&quot;


## Implemented Interfaces

* Serializable


