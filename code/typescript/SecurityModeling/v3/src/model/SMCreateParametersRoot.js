/**
 * Security-Modeling API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import SMCreateParameters from './SMCreateParameters';

/**
 * The SMCreateParametersRoot model module.
 * @module model/SMCreateParametersRoot
 */
class SMCreateParametersRoot {
    /**
     * Constructs a new <code>SMCreateParametersRoot</code>.
     * @alias module:model/SMCreateParametersRoot
     */
    constructor() { 
        
        SMCreateParametersRoot.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SMCreateParametersRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SMCreateParametersRoot} obj Optional instance to populate.
     * @return {module:model/SMCreateParametersRoot} The populated <code>SMCreateParametersRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SMCreateParametersRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [SMCreateParameters]);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<module:model/SMCreateParameters>} data
 */
SMCreateParametersRoot.prototype['data'] = undefined;






export default SMCreateParametersRoot;
