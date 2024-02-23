

# Aum


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested. |  [optional]
**fundLevelAUM** | **Double** | Returns fund-level Assets Under Management (AUM) data. Fund-level AUM is the sum of the market values of the positions in the fund&#39;s portfolio. This represents all share classes. |  [optional]
**shrClassAUMRpt** | **Double** | As-Reported AUM. Calculated by using shares outstanding at previous close multiplied by NAV at previous close. This is typically the value seen on fund websites. As Reported AUM &#x3D; (Shares Outstanding t0 * NAV t0). |  [optional]
**shrClassAUMAct** | **Double** | Actual AUM. Calculated by using shares outstanding at previous close multiplied by NAV of one day prior to close. This is the value used in calculating fund flows. Actual AUM &#x3D; (Shares Outstanding t0 * NAV t-1) |  [optional]
**currency** | **String** | The Currency of the AUM values. By default it will be in the FUnds Currency, unless otherwise requested via the currency parameter. |  [optional]
**date** | **LocalDate** | The date of the AUM in YYYY-MM-DD format. |  [optional]
**requestId** | **String** | The requested Id sent as input. |  [optional]


## Implemented Interfaces

* Serializable


