/**
 * FactSet Fundamentals API
 * Gain access to current, comprehensive, and comparative information on securities in worldwide developed and emerging markets. Composed of annual and interim/quarterly data, detailed historical financial statement content, per-share data, and calculated ratios, FactSet Fundamentals provides you with the information you need for a global investment perspective.<p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p> 
 *
 * The version of the OpenAPI document: 2.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import Address from './Address';
import CompanyReportErrorObject from './CompanyReportErrorObject';
import Exchange from './Exchange';

/**
 * The Profile model module.
 * @module model/Profile
 */
class Profile {
    /**
     * Constructs a new <code>Profile</code>.
     * @alias module:model/Profile
     */
    constructor() { 
        
        Profile.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Profile</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Profile} obj Optional instance to populate.
     * @return {module:model/Profile} The populated <code>Profile</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Profile();

            if (data.hasOwnProperty('requestId')) {
                obj['requestId'] = ApiClient.convertToType(data['requestId'], 'String');
            }
            if (data.hasOwnProperty('error')) {
                obj['error'] = CompanyReportErrorObject.constructFromObject(data['error']);
            }
            if (data.hasOwnProperty('fsymId')) {
                obj['fsymId'] = ApiClient.convertToType(data['fsymId'], 'String');
            }
            if (data.hasOwnProperty('tickerRegion')) {
                obj['tickerRegion'] = ApiClient.convertToType(data['tickerRegion'], 'String');
            }
            if (data.hasOwnProperty('exchange')) {
                obj['exchange'] = Exchange.constructFromObject(data['exchange']);
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('address')) {
                obj['address'] = Address.constructFromObject(data['address']);
            }
            if (data.hasOwnProperty('industryId')) {
                obj['industryId'] = ApiClient.convertToType(data['industryId'], 'String');
            }
            if (data.hasOwnProperty('industry')) {
                obj['industry'] = ApiClient.convertToType(data['industry'], 'String');
            }
            if (data.hasOwnProperty('sectorId')) {
                obj['sectorId'] = ApiClient.convertToType(data['sectorId'], 'String');
            }
            if (data.hasOwnProperty('sector')) {
                obj['sector'] = ApiClient.convertToType(data['sector'], 'String');
            }
            if (data.hasOwnProperty('numberOfEmployees')) {
                obj['numberOfEmployees'] = ApiClient.convertToType(data['numberOfEmployees'], 'Number');
            }
            if (data.hasOwnProperty('ceo')) {
                obj['ceo'] = ApiClient.convertToType(data['ceo'], 'String');
            }
            if (data.hasOwnProperty('businessSummary')) {
                obj['businessSummary'] = ApiClient.convertToType(data['businessSummary'], 'String');
            }
            if (data.hasOwnProperty('yearFounded')) {
                obj['yearFounded'] = ApiClient.convertToType(data['yearFounded'], 'Number');
            }
            if (data.hasOwnProperty('marketCapitalization')) {
                obj['marketCapitalization'] = ApiClient.convertToType(data['marketCapitalization'], 'Number');
            }
            if (data.hasOwnProperty('totalMarketCapitalization')) {
                obj['totalMarketCapitalization'] = ApiClient.convertToType(data['totalMarketCapitalization'], 'Number');
            }
            if (data.hasOwnProperty('sharesOutstanding')) {
                obj['sharesOutstanding'] = ApiClient.convertToType(data['sharesOutstanding'], 'Number');
            }
            if (data.hasOwnProperty('peRatio')) {
                obj['peRatio'] = ApiClient.convertToType(data['peRatio'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Identifier that was used for the request.
 * @member {String} requestId
 */
Profile.prototype['requestId'] = undefined;

/**
 * @member {module:model/CompanyReportErrorObject} error
 */
Profile.prototype['error'] = undefined;

/**
 * FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security's best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.
 * @member {String} fsymId
 */
Profile.prototype['fsymId'] = undefined;

/**
 * FactSet Ticker-Region for the requested security.
 * @member {String} tickerRegion
 */
Profile.prototype['tickerRegion'] = undefined;

/**
 * @member {module:model/Exchange} exchange
 */
Profile.prototype['exchange'] = undefined;

/**
 * Name of the security
 * @member {String} name
 */
Profile.prototype['name'] = undefined;

/**
 * @member {module:model/Address} address
 */
Profile.prototype['address'] = undefined;

/**
 * The industry classification Id for this security. The industry level 5 RBIC (Revere Business Industry Classification) system is used in classification. For more info, visit: [OA page](https://my.apps.factset.com/oa/pages/17498)
 * @member {String} industryId
 */
Profile.prototype['industryId'] = undefined;

/**
 * The industry classification for this security. The industry level 5 RBIC (Revere Business Industry Classification) system is used in classification. For more info, visit: [OA page](https://my.apps.factset.com/oa/pages/17498)
 * @member {String} industry
 */
Profile.prototype['industry'] = undefined;

/**
 * The sector classification Id for this security. The sector level 2 RBIC (Revere Business Industry Classification) system is used in classification. For more info, visit: [OA page](https://my.apps.factset.com/oa/pages/17498)
 * @member {String} sectorId
 */
Profile.prototype['sectorId'] = undefined;

/**
 * The sector classification for this security. The sector level 2 RBIC (Revere Business Industry Classification) system is used in classification. For more info, visit: [OA page](https://my.apps.factset.com/oa/pages/17498)
 * @member {String} sector
 */
Profile.prototype['sector'] = undefined;

/**
 * Number of employees working in the company
 * @member {Number} numberOfEmployees
 */
Profile.prototype['numberOfEmployees'] = undefined;

/**
 * A chief executive officer (CEO) is the highest-ranking executive in a company
 * @member {String} ceo
 */
Profile.prototype['ceo'] = undefined;

/**
 * Summary of the security being requested
 * @member {String} businessSummary
 */
Profile.prototype['businessSummary'] = undefined;

/**
 * The year this security is founded
 * @member {Number} yearFounded
 */
Profile.prototype['yearFounded'] = undefined;

/**
 * The market capitalization of a company. It is the total value of the company's outstanding shares of common stock
 * @member {Number} marketCapitalization
 */
Profile.prototype['marketCapitalization'] = undefined;

/**
 * The total public shares for the company's listed equity. This aggregates across all share classes, with including non-traded shares.
 * @member {Number} totalMarketCapitalization
 */
Profile.prototype['totalMarketCapitalization'] = undefined;

/**
 * The number of common shares that a company has issued and are held by investors
 * @member {Number} sharesOutstanding
 */
Profile.prototype['sharesOutstanding'] = undefined;

/**
 * The price-earnings ratio (P/E ratio) is the ratio for valuing a company that measures its current share price relative to its per-share earnings (EPS)
 * @member {Number} peRatio
 */
Profile.prototype['peRatio'] = undefined;






export default Profile;

