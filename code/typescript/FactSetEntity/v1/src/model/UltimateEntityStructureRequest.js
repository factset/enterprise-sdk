/**
 * FactSet Entity API
 * Using an entity centric data model, FactSet's Entity API provides access to FactSet's complete security and entity level symbology, comprehensive entity reference data, and all of the necessary relationships and connections to create a foundation that tightly correlates disparate sources of information to a master entity identifier. Use this API to quickly understand the full entity structure and related securities.<p><b>Rate limit is set to 10 requests per second</b>.</p> 
 *
 * The version of the OpenAPI document: 1.5.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The UltimateEntityStructureRequest model module.
 * @module model/UltimateEntityStructureRequest
 */
class UltimateEntityStructureRequest {
    /**
     * Constructs a new <code>UltimateEntityStructureRequest</code>.
     * Ultimate Entity Structure Request Body
     * @alias module:model/UltimateEntityStructureRequest
     * @param ids {Array.<String>} Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. 
     */
    constructor(ids) { 
        
        UltimateEntityStructureRequest.initialize(this, ids);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, ids) { 
        obj['ids'] = ids;
    }

    /**
     * Constructs a <code>UltimateEntityStructureRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UltimateEntityStructureRequest} obj Optional instance to populate.
     * @return {module:model/UltimateEntityStructureRequest} The populated <code>UltimateEntityStructureRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UltimateEntityStructureRequest();

            if (data.hasOwnProperty('ids')) {
                obj['ids'] = ApiClient.convertToType(data['ids'], ['String']);
            }
            if (data.hasOwnProperty('level')) {
                obj['level'] = ApiClient.convertToType(data['level'], 'Number');
            }
            if (data.hasOwnProperty('active')) {
                obj['active'] = ApiClient.convertToType(data['active'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. 
 * @member {Array.<String>} ids
 */
UltimateEntityStructureRequest.prototype['ids'] = undefined;

/**
 * Controls the levels returned in the hierarchy. Use -1 to return all levels, or 1-n for a specific level.
 * @member {Number} level
 * @default -1
 */
UltimateEntityStructureRequest.prototype['level'] = -1;

/**
 * Controls active or inactive securities returned in the hierarchy. Enter 1 to return only active entities, 0 for inactive entities, and -1 for all active and inactive.
 * @member {Number} active
 * @default -1
 */
UltimateEntityStructureRequest.prototype['active'] = -1;






export default UltimateEntityStructureRequest;

