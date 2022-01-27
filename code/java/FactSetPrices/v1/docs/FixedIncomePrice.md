

# FixedIncomePrice


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | Factset Security Identifier. Six alpha-numeric characters, excluding vowels, with an -S suffix (XXXXXX-S). |  [optional]
**date** | **LocalDate** | Ending date for the period expressed in YYYY-MM-DD format. |  [optional]
**securityType** | **String** | Returns the security type code of fixed income instruments.   * AGCY - Agency   * BDNT - Bond/Note   * BDWT  - Bond with Warrants   * BKAC  - Bankers Acceptance   * BLDN - Bill/Discount Note   * BOND  - Bond   * CAP  - Embedded ceiling or short interest rates   * CAPS - Capital Security   * CAPT - Capital Trust Security   * CD - Certificate of Deposit (Munis)   * CDO - Collateralized Debt Obligation   * CMO  - Collateralized mortgage obligation   * COMP - Commercial Paper   * CONV - Convertible/Exchangeable   * CONVP - Convertible Preferred   * CORP - Corporate   * COVR - Covered Bond   * CP  - Commercial Paper   * CRL - Credit Linked Security   * DEB - Debenture   * DERI  - Derivative (generic type)   * EBON - Eurobond   * EQL - Equity Linked Security   * FORW  - Forward deliveries   * GRTR  - Grantor trust   * HY - Hypotheken Pfandbriefe   * IIDX - Inflation Indexed Security   * INVF  - Inverse floaters   * LAUTH - Local Authority/Political Division   * LINK  - Linked securities   * LKS - Linked Securities   * MAPL - Mixed Asset Portfolio Linked Security   * MM - Money Market   * NOTE  - Note   * OF - Obligations FonciÃres   * OPTN  - Options   * OTHL - Other Linked Security   * PAYS  - Payment streams   * PFD - Preferred   * PFND - Pfandbriefe   * POOL  - Pooled derivatives   * PSEC - Preferred Security   * PSTK - Preferred Stock   * REPO  - REPOS   * RMIC  - REMIC   * SHFL  - Short floats (auction)   * STRIPS - STRIPS   * SWAP  - Embedded swaps   * TR  - Trust   * TRUPS - Trust Preferred Security  |  [optional]
**issuerEntityId** | **String** | Fixed Income Issuer Entity ID (-E). |  [optional]
**issuerType** | **String** | Returns the issuer type code of fixed income instruments.   * AGCY - Agency   * CORP - Corporate   * LAUTH - Local Authority/Political Division   * MUNI - Municipals   * SOV - Sovereign   * SUPR - Supranational   * SCOL - Securitized/Collateralized  |  [optional]
**priceBid** | **Double** | BID PRICE. For North American issues, the value is an evaluated price, where available, else it is an exchange-traded price. Please note that distinct Bid and Ask Prices are not available for North American issues; Bid, Mid, and Ask Prices will be identical for North American issues. For issues outside of North America (International), the value is an evaluated price. Please note that distinct Bid and Ask Prices are only available for issues outside of North America. By default, the Mid Price is returned for issues outside of North America. |  [optional]
**priceMid** | **Double** | MID Price. For North American issues, the value is an evaluated price, where available, else it is an exchange-traded price. Please note that distinct Bid and Ask Prices are not available for North American issues; Bid, Mid, and Ask Prices will be identical for North American issues. For issues outside of North America (International), the value is an evaluated price. Please note that distinct Bid and Ask Prices are only available for issues outside of North America. By default, the Mid Price is returned for issues outside of North America. |  [optional]
**priceAsk** | **Double** | ASK Price. For North American issues, the value is an evaluated price, where available, else it is an exchange-traded price. Please note that distinct Bid and Ask Prices are not available for North American issues; Bid, Mid, and Ask Prices will be identical for North American issues. For issues outside of North America (International), the value is an evaluated price. Please note that distinct Bid and Ask Prices are only available for issues outside of North America. By default, the Mid Price is returned for issues outside of North America. |  [optional]
**requestId** | **String** | Identifier that was used for the request. |  [optional]


## Implemented Interfaces

* Serializable


