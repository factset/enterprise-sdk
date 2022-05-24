/**
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import InlineResponse200DataFsymSecurity from './InlineResponse200DataFsymSecurity';

/**
 * The InlineResponse200DataFsym model module.
 * @module model/InlineResponse200DataFsym
 * @version 0.10.0
 */
class InlineResponse200DataFsym {
    /**
     * Constructs a new <code>InlineResponse200DataFsym</code>.
     * Instrument-level FactSet identifier of the financial instrument used primarily in FactSet products other than the MDG.
     * @alias module:model/InlineResponse200DataFsym
     */
    constructor() { 
        
        InlineResponse200DataFsym.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse200DataFsym</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse200DataFsym} obj Optional instance to populate.
     * @return {module:model/InlineResponse200DataFsym} The populated <code>InlineResponse200DataFsym</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse200DataFsym();

            if (data.hasOwnProperty('security')) {
                obj['security'] = InlineResponse200DataFsymSecurity.constructFromObject(data['security']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse200DataFsymSecurity} security
 */
InlineResponse200DataFsym.prototype['security'] = undefined;






export default InlineResponse200DataFsym;
