/**
 * FI API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.12.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import FIJobSettings from './FIJobSettings';
import FISecurity from './FISecurity';

/**
 * The FICalculationParameters model module.
 * @module model/FICalculationParameters
 */
class FICalculationParameters {
    /**
     * Constructs a new <code>FICalculationParameters</code>.
     * @alias module:model/FICalculationParameters
     * @param securities {Array.<module:model/FISecurity>} List of securities
     * @param calculations {Array.<String>} List of calculations
     * @param jobSettings {module:model/FIJobSettings} 
     */
    constructor(securities, calculations, jobSettings) { 
        
        FICalculationParameters.initialize(this, securities, calculations, jobSettings);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, securities, calculations, jobSettings) { 
        obj['securities'] = securities;
        obj['calculations'] = calculations;
        obj['jobSettings'] = jobSettings;
    }

    /**
     * Constructs a <code>FICalculationParameters</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FICalculationParameters} obj Optional instance to populate.
     * @return {module:model/FICalculationParameters} The populated <code>FICalculationParameters</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FICalculationParameters();

            if (data.hasOwnProperty('securities')) {
                obj['securities'] = ApiClient.convertToType(data['securities'], [FISecurity]);
            }
            if (data.hasOwnProperty('calculations')) {
                obj['calculations'] = ApiClient.convertToType(data['calculations'], ['String']);
            }
            if (data.hasOwnProperty('jobSettings')) {
                obj['jobSettings'] = FIJobSettings.constructFromObject(data['jobSettings']);
            }
        }
        return obj;
    }


}

/**
 * List of securities
 * @member {Array.<module:model/FISecurity>} securities
 */
FICalculationParameters.prototype['securities'] = undefined;

/**
 * List of calculations
 * @member {Array.<String>} calculations
 */
FICalculationParameters.prototype['calculations'] = undefined;

/**
 * @member {module:model/FIJobSettings} jobSettings
 */
FICalculationParameters.prototype['jobSettings'] = undefined;






export default FICalculationParameters;

