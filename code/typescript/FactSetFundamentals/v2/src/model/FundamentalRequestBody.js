/**
 * FactSet Fundamentals API
 * Gain access to current, comprehensive, and comparative information on securities in worldwide developed and emerging markets. Composed of annual and interim/quarterly data, detailed historical financial statement content, per-share data, and calculated ratios, FactSet Fundamentals provides you with the information you need for a global investment perspective. 
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import Batch from './Batch';
import FiscalPeriod from './FiscalPeriod';
import Periodicity from './Periodicity';
import UpdateType from './UpdateType';

/**
 * The FundamentalRequestBody model module.
 * @module model/FundamentalRequestBody
 */
class FundamentalRequestBody {
    /**
     * Constructs a new <code>FundamentalRequestBody</code>.
     * Fundamentals request body elements
     * @alias module:model/FundamentalRequestBody
     * @param ids {Array.<String>} The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.  <p>ids limit =  1000 per non-batch request / 30000 per batch request</p> 
     * @param metrics {Array.<String>} Requested List of Financial Statement Items or Ratios. Use /metrics endpoint for a complete list of available FF_* metric items. 
     */
    constructor(ids, metrics) { 
        
        FundamentalRequestBody.initialize(this, ids, metrics);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, ids, metrics) { 
        obj['ids'] = ids;
        obj['metrics'] = metrics;
    }

    /**
     * Constructs a <code>FundamentalRequestBody</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FundamentalRequestBody} obj Optional instance to populate.
     * @return {module:model/FundamentalRequestBody} The populated <code>FundamentalRequestBody</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FundamentalRequestBody();

            if (data.hasOwnProperty('ids')) {
                obj['ids'] = ApiClient.convertToType(data['ids'], ['String']);
            }
            if (data.hasOwnProperty('periodicity')) {
                obj['periodicity'] = Periodicity.constructFromObject(data['periodicity']);
            }
            if (data.hasOwnProperty('fiscalPeriod')) {
                obj['fiscalPeriod'] = FiscalPeriod.constructFromObject(data['fiscalPeriod']);
            }
            if (data.hasOwnProperty('metrics')) {
                obj['metrics'] = ApiClient.convertToType(data['metrics'], ['String']);
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = ApiClient.convertToType(data['currency'], 'String');
            }
            if (data.hasOwnProperty('updateType')) {
                obj['updateType'] = UpdateType.constructFromObject(data['updateType']);
            }
            if (data.hasOwnProperty('batch')) {
                obj['batch'] = Batch.constructFromObject(data['batch']);
            }
        }
        return obj;
    }


}

/**
 * The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.  <p>ids limit =  1000 per non-batch request / 30000 per batch request</p> 
 * @member {Array.<String>} ids
 */
FundamentalRequestBody.prototype['ids'] = undefined;

/**
 * @member {module:model/Periodicity} periodicity
 */
FundamentalRequestBody.prototype['periodicity'] = undefined;

/**
 * @member {module:model/FiscalPeriod} fiscalPeriod
 */
FundamentalRequestBody.prototype['fiscalPeriod'] = undefined;

/**
 * Requested List of Financial Statement Items or Ratios. Use /metrics endpoint for a complete list of available FF_* metric items. 
 * @member {Array.<String>} metrics
 */
FundamentalRequestBody.prototype['metrics'] = undefined;

/**
 * Currency code for currency values. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). 
 * @member {String} currency
 * @default 'LOCAL'
 */
FundamentalRequestBody.prototype['currency'] = 'LOCAL';

/**
 * @member {module:model/UpdateType} updateType
 */
FundamentalRequestBody.prototype['updateType'] = undefined;

/**
 * @member {module:model/Batch} batch
 */
FundamentalRequestBody.prototype['batch'] = undefined;






export default FundamentalRequestBody;
