package com.bullhornsdk.data.api.mock

import com.bullhornsdk.data.api.helper.RestJsonConverter
import com.bullhornsdk.data.api.helper.concurrency.ConcurrencyService
import com.bullhornsdk.data.api.helper.concurrency.standard.RestConcurrencyService
import com.bullhornsdk.data.model.entity.core.customobject.ClientCorporationCustomObject
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObject
import com.bullhornsdk.data.model.entity.core.customobject.PlacementCustomObject
import com.bullhornsdk.data.model.entity.core.customobject.UserCustomObject
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance1
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance10
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance11
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance12
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance13
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance14
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance15
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance16
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance17
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance18
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance19
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance2
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance20
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance21
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance22
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance23
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance24
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance25
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance26
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance27
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance28
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance29
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance3
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance30
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance31
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance32
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance33
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance34
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance35
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance4
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance5
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance6
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance7
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance8
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance9
import com.bullhornsdk.data.model.entity.core.customobjectinstances.joborder.JobOrderCustomObjectInstance1
import com.bullhornsdk.data.model.entity.core.customobjectinstances.joborder.JobOrderCustomObjectInstance10
import com.bullhornsdk.data.model.entity.core.customobjectinstances.joborder.JobOrderCustomObjectInstance2
import com.bullhornsdk.data.model.entity.core.customobjectinstances.joborder.JobOrderCustomObjectInstance3
import com.bullhornsdk.data.model.entity.core.customobjectinstances.joborder.JobOrderCustomObjectInstance4
import com.bullhornsdk.data.model.entity.core.customobjectinstances.joborder.JobOrderCustomObjectInstance5
import com.bullhornsdk.data.model.entity.core.customobjectinstances.joborder.JobOrderCustomObjectInstance6
import com.bullhornsdk.data.model.entity.core.customobjectinstances.joborder.JobOrderCustomObjectInstance7
import com.bullhornsdk.data.model.entity.core.customobjectinstances.joborder.JobOrderCustomObjectInstance8
import com.bullhornsdk.data.model.entity.core.customobjectinstances.joborder.JobOrderCustomObjectInstance9
import com.bullhornsdk.data.model.entity.core.customobjectinstances.opportunity.OpportunityCustomObjectInstance1
import com.bullhornsdk.data.model.entity.core.customobjectinstances.opportunity.OpportunityCustomObjectInstance10
import com.bullhornsdk.data.model.entity.core.customobjectinstances.opportunity.OpportunityCustomObjectInstance2
import com.bullhornsdk.data.model.entity.core.customobjectinstances.opportunity.OpportunityCustomObjectInstance3
import com.bullhornsdk.data.model.entity.core.customobjectinstances.opportunity.OpportunityCustomObjectInstance4
import com.bullhornsdk.data.model.entity.core.customobjectinstances.opportunity.OpportunityCustomObjectInstance5
import com.bullhornsdk.data.model.entity.core.customobjectinstances.opportunity.OpportunityCustomObjectInstance6
import com.bullhornsdk.data.model.entity.core.customobjectinstances.opportunity.OpportunityCustomObjectInstance7
import com.bullhornsdk.data.model.entity.core.customobjectinstances.opportunity.OpportunityCustomObjectInstance8
import com.bullhornsdk.data.model.entity.core.customobjectinstances.opportunity.OpportunityCustomObjectInstance9
import com.bullhornsdk.data.model.entity.core.customobjectinstances.person.PersonCustomObjectInstance1
import com.bullhornsdk.data.model.entity.core.customobjectinstances.person.PersonCustomObjectInstance10
import com.bullhornsdk.data.model.entity.core.customobjectinstances.person.PersonCustomObjectInstance2
import com.bullhornsdk.data.model.entity.core.customobjectinstances.person.PersonCustomObjectInstance3
import com.bullhornsdk.data.model.entity.core.customobjectinstances.person.PersonCustomObjectInstance4
import com.bullhornsdk.data.model.entity.core.customobjectinstances.person.PersonCustomObjectInstance5
import com.bullhornsdk.data.model.entity.core.customobjectinstances.person.PersonCustomObjectInstance6
import com.bullhornsdk.data.model.entity.core.customobjectinstances.person.PersonCustomObjectInstance7
import com.bullhornsdk.data.model.entity.core.customobjectinstances.person.PersonCustomObjectInstance8
import com.bullhornsdk.data.model.entity.core.customobjectinstances.person.PersonCustomObjectInstance9
import com.bullhornsdk.data.model.entity.core.customobjectinstances.placement.PlacementCustomObjectInstance1
import com.bullhornsdk.data.model.entity.core.customobjectinstances.placement.PlacementCustomObjectInstance10
import com.bullhornsdk.data.model.entity.core.customobjectinstances.placement.PlacementCustomObjectInstance2
import com.bullhornsdk.data.model.entity.core.customobjectinstances.placement.PlacementCustomObjectInstance3
import com.bullhornsdk.data.model.entity.core.customobjectinstances.placement.PlacementCustomObjectInstance4
import com.bullhornsdk.data.model.entity.core.customobjectinstances.placement.PlacementCustomObjectInstance5
import com.bullhornsdk.data.model.entity.core.customobjectinstances.placement.PlacementCustomObjectInstance6
import com.bullhornsdk.data.model.entity.core.customobjectinstances.placement.PlacementCustomObjectInstance7
import com.bullhornsdk.data.model.entity.core.customobjectinstances.placement.PlacementCustomObjectInstance8
import com.bullhornsdk.data.model.entity.core.customobjectinstances.placement.PlacementCustomObjectInstance9
import com.bullhornsdk.data.model.entity.core.edithistory.EditHistory
import com.bullhornsdk.data.model.entity.core.edithistory.FieldChange
import com.bullhornsdk.data.model.entity.core.standard.*
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity
import com.bullhornsdk.data.model.entity.core.type.SearchEntity
import com.bullhornsdk.data.model.entity.embedded.UserType
import com.bullhornsdk.data.model.entity.file.CandidateFileAttachment
import com.bullhornsdk.data.model.entity.file.ClientContactFileAttachment
import com.bullhornsdk.data.model.entity.file.ClientCorporationFileAttachment
import com.bullhornsdk.data.model.entity.file.JobOrderFileAttachment
import com.bullhornsdk.data.model.entity.file.OpportunityFileAttachment
import com.bullhornsdk.data.model.entity.file.PlacementFileAttachment
import com.bullhornsdk.data.model.entity.meta.MetaData
import com.bullhornsdk.data.model.entity.meta.StandardMetaData
import com.bullhornsdk.data.model.enums.BullhornEntityInfo
import com.bullhornsdk.data.model.response.edithistory.EditHistoryListWrapper
import com.bullhornsdk.data.model.response.edithistory.FieldChangeListWrapper
import com.bullhornsdk.data.model.response.event.standard.StandardGetEventsResponse
import com.bullhornsdk.data.model.response.event.standard.StandardGetLastRequestIdResponse
import com.bullhornsdk.data.model.response.list.FastFindListWrapper
import com.bullhornsdk.data.model.response.list.ListWrapper
import com.bullhornsdk.data.util.copy.KryoObjectCopyHelper
import org.apache.commons.io.IOUtils
import org.apache.log4j.Logger
import org.springframework.core.io.ClassPathResource

import java.util.concurrent.ConcurrentHashMap

public class MockDataLoader {

    private final static Logger log = Logger.getLogger(MockDataLoader.class);
    private final RestJsonConverter restJsonConverter;

    private Map<Class<? extends BullhornEntity>, Map<Integer, ? extends BullhornEntity>> restEntityMapCache;
    private List<FastFindResult> fastFindResultListCache;
    private List<EditHistory> editHistoryListCache;
    private List<FieldChange> editHistoryFieldChangeListCache;
    private StandardGetEventsResponse getEventsResponseCache;
    private StandardGetLastRequestIdResponse getLastRequestIdResponseCache;
    private Map<String, Object> settingsResultMapCache;
    private Settings settingsObjectResultCache;
    private Map<String, Object> optionsResultMapCache;
    private Map<Class<? extends BullhornEntity>, MetaData<?>> restMetaDataMapCache;
    private Map<Class<? extends SearchEntity>, List<MockSearchField>> searchFieldsMapCache;

    private Map<Class<? extends BullhornEntity>, Map<Integer, ? extends BullhornEntity>> restEntityMap;
    private List<FastFindResult> fastFindResultList;
    private List<EditHistory> editHistoryList;
    private List<FieldChange> editHistoryFieldChangeList;
    private StandardGetEventsResponse getEventsResponse;
    private StandardGetLastRequestIdResponse getLastRequestIdResponse;
    private Map<String, Object> settingsResultMap;
    private Settings settingsObjectResult;
    private Map<String, Object> optionsResultMap;
    private Map<Class<? extends BullhornEntity>, MetaData<?>> restMetaDataMap;

    private Map<Class<? extends BullhornEntity>, String> entityFileNames;
    private Map<Class<? extends BullhornEntity>, String> metaDataFileNames;
    private Map<Class<? extends SearchEntity>, String> searchFieldsFileNames;
    private final ConcurrencyService concurrencyService;

    private Map<Class<? extends SearchEntity>, List<MockSearchField>> searchFieldsMap;

    public MockDataLoader() {
        super();
        this.restJsonConverter = new RestJsonConverter();
        this.entityFileNames = getEntityFileNames();
        this.metaDataFileNames = getMetaDataFileNames();
        this.searchFieldsFileNames = getSearchFieldFileNames();
        this.concurrencyService = new RestConcurrencyService();
    }

    public Map<Class<? extends SearchEntity>, List<MockSearchField>> getSearchFields() {
        if (searchFieldsMap == null) {
            reloadSearchFieldData();
            this.searchFieldsMapCache = KryoObjectCopyHelper.copy(searchFieldsMap);
        }
        return searchFieldsMap;
    }

    public Map<Class<? extends BullhornEntity>, MetaData<?>> getMetaTestData() {
        if (restMetaDataMap == null) {
            reloadMetaData();
            this.restMetaDataMapCache = KryoObjectCopyHelper.copy(restMetaDataMap);
        }
        return restMetaDataMap;
    }

    public Map<Class<? extends BullhornEntity>, Map<Integer, ? extends BullhornEntity>> getEntityTestData() {
        if (restEntityMap == null) {
            reloadEntityData();
            this.restEntityMapCache = KryoObjectCopyHelper.copy(restEntityMap);
        }
        return restEntityMap;
    }

    public List<EditHistory> getEditHistoryList() {
        if (editHistoryList == null) {
            reloadEditHistoryResults();
            this.editHistoryListCache = KryoObjectCopyHelper.copy(editHistoryList);
        }
        return editHistoryList;
    }

    public List<EditHistory> getEditHistoryFieldChangeList() {
        if (editHistoryFieldChangeList == null) {
            reloadEditHistoryFieldChangeResults();
            this.editHistoryFieldChangeListCache = KryoObjectCopyHelper.copy(editHistoryFieldChangeList);
        }
        return editHistoryFieldChangeList;
    }

    public List<FastFindResult> getFastFindResults() {
        if (fastFindResultList == null) {
            reloadFastFindResults();
            this.fastFindResultListCache = KryoObjectCopyHelper.copy(fastFindResultList);
        }
        return fastFindResultList;
    }

    public StandardGetEventsResponse getEventsResponse() {
        if (getEventsResponse == null) {
            reloadGetEventsResponses();
            this.getEventsResponseCache = KryoObjectCopyHelper.copy(getEventsResponse);
        }

        return getEventsResponse;
    }

    public StandardGetLastRequestIdResponse getLastRequestIdResponse() {
        if (getLastRequestIdResponse == null) {
            reloadGetLastRequestIdResponses();
            this.getLastRequestIdResponseCache = KryoObjectCopyHelper.copy(getLastRequestIdResponse);
        }

        return getLastRequestIdResponse;
    }


    public Map<String, Object> getSettingsResults() {
        if (settingsResultMap == null) {
            reloadSettingsResults();
            this.settingsResultMapCache = KryoObjectCopyHelper.copy(settingsResultMap);
        }
        return settingsResultMap;
    }

    public Settings getSettingsObjectResults() {
        if (settingsObjectResult == null) {
            reloadSettingsObjectResults();
            this.settingsObjectResultCache = KryoObjectCopyHelper.copy(settingsObjectResult);
        }
        return settingsObjectResult;
    }

    public Map<String, Object> getOptionsResults() {
        if (optionsResultMap == null) {
            reloadOptionsResults();
            this.optionsResultMapCache = KryoObjectCopyHelper.copy(optionsResultMap);
        }
        return optionsResultMap;
    }

    /**
     * Returns a map with entities loaded fresh from the test data.
     *
     * @return
     */
    public <T extends BullhornEntity> Map<Class<? extends BullhornEntity>, Map<Integer, ? extends BullhornEntity>> reloadEntityData() {
        this.restEntityMap = new ConcurrentHashMap<Class<? extends BullhornEntity>, Map<Integer, ? extends BullhornEntity>>();

        entityFileNames.entrySet().parallelStream().each {
            String jsonData = getFileData(it.getValue());
            List<? extends BullhornEntity> data = jsonStringToEntityList(jsonData, it.getKey());
            addMapEntryForOneEntity(data, it.getKey());
        };

        return restEntityMap;

    }

    public void reloadEditHistoryResults() {
        String jsonData = getFileData("edithistory/edithistory-data.txt");
        EditHistoryListWrapper listWrapper = restJsonConverter.jsonToEntityDoNotUnwrapRoot(jsonData, EditHistoryListWrapper.class);
        this.editHistoryList = listWrapper.getData();
    }

    public void reloadEditHistoryFieldChangeResults() {
        String jsonData = getFileData("edithistory/fieldchange-data.txt");
        FieldChangeListWrapper listWrapper = restJsonConverter.jsonToEntityDoNotUnwrapRoot(jsonData, FieldChangeListWrapper.class);
        this.editHistoryFieldChangeList = listWrapper.getData();
    }

    public void reloadFastFindResults() {

        String jsonData = getFileData("fastfind-data.txt");
        FastFindListWrapper listWrapper = restJsonConverter.jsonToEntityDoNotUnwrapRoot(jsonData, FastFindListWrapper.class);
        this.fastFindResultList = listWrapper.getData();
    }

    public void reloadGetEventsResponses() {
        String jsonData = getFileData("event-data.txt");
        StandardGetEventsResponse eventsResponse = restJsonConverter.jsonToEntityDoNotUnwrapRoot(jsonData, StandardGetEventsResponse.class);
        this.getEventsResponse = eventsResponse;
    }

    public void reloadGetLastRequestIdResponses() {
        String jsonData = getFileData("lastrequestid-data.txt");
        StandardGetLastRequestIdResponse response = restJsonConverter.jsonToEntityDoNotUnwrapRoot(jsonData, StandardGetLastRequestIdResponse.class);
        this.getLastRequestIdResponse = response;
    }

    public void reloadSettingsResults() {

        String jsonData = getFileData("settings-data.txt");
        Map<String, Object> resultData = restJsonConverter.jsonToEntityDoNotUnwrapRoot(jsonData, Map.class);
        this.settingsResultMap = resultData;
    }

    public void reloadSettingsObjectResults() {

        String jsonData = getFileData("settings-data.txt");
        Settings resultData = restJsonConverter.jsonToEntityDoNotUnwrapRoot(jsonData, Settings.class);
        this.settingsObjectResult = resultData;
    }

    public void reloadOptionsResults() {

        String jsonData = getFileData("options-data.txt");
        Map<String, Object> resultData = restJsonConverter.jsonToEntityDoNotUnwrapRoot(jsonData, Map.class);
        this.optionsResultMap = resultData;
    }

    /**
     * Returns a map with entities loaded fresh from the test data.
     *
     * @return
     */
    public <T extends BullhornEntity> Map<Class<? extends BullhornEntity>, MetaData<?>> reloadMetaData() {
        this.restMetaDataMap = new ConcurrentHashMap<Class<? extends BullhornEntity>, MetaData<?>>();

        metaDataFileNames.entrySet().parallelStream().each {
            String jsonData = getFileData(it.getValue());
            MetaData<T> metaData = jsonStringToMetaData(jsonData);
            restMetaDataMap.put(it.getKey(), metaData);
        }
        return restMetaDataMap;

    }

    /**
     * Returns a map with entities loaded fresh from the test data.
     *
     * @return
     */
    public <T extends SearchEntity> Map<Class<? extends SearchEntity>, List<MockSearchField>> reloadSearchFieldData() {
        this.searchFieldsMap = new ConcurrentHashMap<Class<? extends SearchEntity>, List<MockSearchField>>();
        searchFieldsFileNames.entrySet().parallelStream().each {
            String jsonData = getFileData(it.getValue());
            List<MockSearchField> searchFields = jsonStringToMockSearchFields(jsonData);
            searchFieldsMap.put(it.getKey(), searchFields);
        }
        return searchFieldsMap;

    }


    public <T extends BullhornEntity> Map<Class<? extends BullhornEntity>, Map<Integer, ? extends BullhornEntity>> reloadEntityDataFromCache() {
        this.restEntityMap = KryoObjectCopyHelper.copy(restEntityMapCache);
        return restEntityMap;

    }

    /**
     * Returns a map with entities loaded fresh from the test data.
     *
     * @return
     */
    public <T extends BullhornEntity> Map<Class<? extends BullhornEntity>, MetaData<?>> reloadMetaDataFromCache() {
        this.restMetaDataMap = KryoObjectCopyHelper.copy(restMetaDataMapCache);
        return restMetaDataMap;

    }

    /**
     * Get the json data from a file.
     *
     * @param fileName
     * @return The json data stored in a file
     */
    private String getFileData(String fileName) {

        String jsonDataString = "";
        try {

            ClassPathResource data = new ClassPathResource("testdata/rest/" + fileName);
            jsonDataString = IOUtils.toString(data.getInputStream(), "UTF-8");

        } catch (IOException e) {
            log.error("Unable to load test data from filename: " + fileName);
            throw new IllegalArgumentException("Unable to load test data from filename: " + fileName, e);
        }

        return jsonDataString;
    }

    /**
     * Convert the json data to a List<T> of RestEntities
     *
     * @param jsonData
     *            The string of json to convert
     * @param type
     *            The type to convert to
     *
     * @return a list of RestEntities of type T
     */
    private <T extends BullhornEntity> List<T> jsonStringToEntityList(String jsonData, Class<T> type) {

        ListWrapper<T> listWrapper = restJsonConverter.jsonToEntityDoNotUnwrapRoot(jsonData, BullhornEntityInfo.getTypesListWrapperType(type));

        return listWrapper.getData();

    }

    /**
     * Converts the json data to a MetaData<T> object
     *
     * @param jsonData
     * @param type
     *            the BullhornEntity type
     * @return
     */
    private <T extends BullhornEntity> MetaData<T> jsonStringToMetaData(String jsonData) {
        return restJsonConverter.jsonToEntityDoNotUnwrapRoot(jsonData, StandardMetaData.class);
    }

    /**
     * Converts the searchField json data to a list of fields
     * @param jsonData
     * @return
     */
    private List<MockSearchField> jsonStringToMockSearchFields(String jsonData) {

        MockSearchFieldWrapper fieldsWrapper = restJsonConverter.jsonToEntityDoNotUnwrapRoot(jsonData, MockSearchFieldWrapper.class);

        return fieldsWrapper.getSearchFields();

    }

    /**
     * Adds a list of List<T> RestEntities to the restEntityMap
     *
     * @param type
     * @param data
     */
    private <T extends BullhornEntity> void addMapEntryForOneEntity(List<T> data, Class<? extends BullhornEntity> type) {

        Map<Integer, T> oneEntityMap = new ConcurrentHashMap<Integer, T>();

        for (T entity : data) {
            oneEntityMap.put(entity.getId(), entity);
        }

        this.restEntityMap.put(type, oneEntityMap);

    }

    public static Map<Class<? extends BullhornEntity>, String> getEntityFileNames() {
        Map<Class<? extends BullhornEntity>, String> entityFiles = new LinkedHashMap<Class<? extends BullhornEntity>, String>();
        entityFiles.put(Appointment.class, "appointment-data.txt");
        entityFiles.put(AppointmentAttendee.class, "appointmentattendee-data.txt");
        entityFiles.put(Branch.class, "branch-data.txt");
        entityFiles.put(BusinessSector.class, "businesssector-data.txt");
        entityFiles.put(Candidate.class, "candidate-data.txt");
        entityFiles.put(CandidateCertification.class, "candidatecertification-data.txt");
        entityFiles.put(CandidateEducation.class, "candidateeducation-data.txt");
        entityFiles.put(CandidateReference.class, "candidatereference-data.txt");
        entityFiles.put(CandidateWorkHistory.class, "candidateworkhistory-data.txt");
        entityFiles.put(Category.class, "category-data.txt");
        entityFiles.put(Certification.class, "certification-data.txt");
        entityFiles.put(CertificationGroup.class, "certificationgroup-data.txt");
        entityFiles.put(ClientContact.class, "clientcontact-data.txt");
        entityFiles.put(ClientContact1.class, "clientcontact1-data.txt");
        entityFiles.put(ClientContact2.class, "clientcontact2-data.txt");
        entityFiles.put(ClientContact3.class, "clientcontact3-data.txt");
        entityFiles.put(ClientContact4.class, "clientcontact4-data.txt");
        entityFiles.put(ClientContact5.class, "clientcontact5-data.txt");
        entityFiles.put(ClientCorporation.class, "clientcorporation-data.txt");
        entityFiles.put(ClientCorporation1.class, "clientcorporation1-data.txt");
        entityFiles.put(ClientCorporation2.class, "clientcorporation2-data.txt");
        entityFiles.put(ClientCorporation3.class, "clientcorporation3-data.txt");
        entityFiles.put(ClientCorporation4.class, "clientcorporation4-data.txt");
        entityFiles.put(ClientCorporation5.class, "clientcorporation5-data.txt");
        entityFiles.put(ClientCorporationCertification.class, "clientcorporationcertification-data.txt");
        entityFiles.put(CorporateUser.class, "corporateuser-data.txt");
        entityFiles.put(CorporationDepartment.class, "corporationdepartment-data.txt");
        entityFiles.put(Country.class, "country-data.txt");
        entityFiles.put(Department.class, "department-data.txt");
        entityFiles.put(DistributionList.class, "distributionlist-data.txt");
        entityFiles.put(File.class, "file-data.txt");
        entityFiles.put(HousingComplex.class, "housingcomplex-data.txt");
        entityFiles.put(HousingComplexUnit.class, "housingcomplexunit-data.txt");
        entityFiles.put(HousingComplexFurnitureDelivery.class, "housingcomplexfurnituredelivery-data.txt");
        entityFiles.put(HousingComplexUtilityAccount.class, "housingcomplexutilityaccount-data.txt");
        entityFiles.put(UserHousingComplexUnit.class, "userhousingcomplexunit-data.txt");
        entityFiles.put(JobBoardPost.class, "jobboardpost-data.txt");
        entityFiles.put(JobOrder.class, "joborder-data.txt");
        entityFiles.put(JobSubmission.class, "jobsubmission-data.txt");
        entityFiles.put(JobSubmissionHistory.class, "jobsubmissionhistory-data.txt");
        entityFiles.put(Lead.class, "lead-data.txt");
        entityFiles.put(Note.class, "note-data.txt");
        entityFiles.put(NoteEntity.class, "noteentity-data.txt");
        entityFiles.put(Opportunity.class, "opportunity-data.txt");
        entityFiles.put(Person.class, "person-data.txt");
        entityFiles.put(Placement.class, "placement-data.txt");
        entityFiles.put(PlacementCertification.class, "placementcertification-data.txt");
        entityFiles.put(PlacementChangeRequest.class, "placementchangerequest-data.txt");
        entityFiles.put(PlacementCommission.class, "placementcommission-data.txt");
        entityFiles.put(PrivateLabel.class, "privatelabel-data.txt");
        entityFiles.put(Sendout.class, "sendout-data.txt");
        entityFiles.put(Skill.class, "skill-data.txt");
        entityFiles.put(Specialty.class, "specialty-data.txt");
        entityFiles.put(State.class, "state-data.txt");
        entityFiles.put(Task.class, "task-data.txt");
        entityFiles.put(Tearsheet.class, "tearsheet-data.txt");
        entityFiles.put(TearsheetMember.class, "tearsheetmember-data.txt");
        entityFiles.put(TimeUnit.class, "timeunit-data.txt");
        entityFiles.put(UserType.class, "usertype-data.txt");
        entityFiles.put(WorkersCompensation.class, "workerscompensation-data.txt");
        entityFiles.put(WorkersCompensationRate.class, "workerscompensationrate-data.txt");

        entityFiles.put(JobOrderCustomObjectInstance1.class, "customobjectinstances/jobordercustomobjectinstance1-data.txt");
        entityFiles.put(JobOrderCustomObjectInstance2.class, "customobjectinstances/jobordercustomobjectinstance2-data.txt");
        entityFiles.put(JobOrderCustomObjectInstance3.class, "customobjectinstances/jobordercustomobjectinstance3-data.txt");
        entityFiles.put(JobOrderCustomObjectInstance4.class, "customobjectinstances/jobordercustomobjectinstance4-data.txt");
        entityFiles.put(JobOrderCustomObjectInstance5.class, "customobjectinstances/jobordercustomobjectinstance5-data.txt");
        entityFiles.put(JobOrderCustomObjectInstance6.class, "customobjectinstances/jobordercustomobjectinstance6-data.txt");
        entityFiles.put(JobOrderCustomObjectInstance7.class, "customobjectinstances/jobordercustomobjectinstance7-data.txt");
        entityFiles.put(JobOrderCustomObjectInstance8.class, "customobjectinstances/jobordercustomobjectinstance8-data.txt");
        entityFiles.put(JobOrderCustomObjectInstance9.class, "customobjectinstances/jobordercustomobjectinstance9-data.txt");
        entityFiles.put(JobOrderCustomObjectInstance10.class, "customobjectinstances/jobordercustomobjectinstance10-data.txt");
        entityFiles.put(OpportunityCustomObjectInstance1.class, "customobjectinstances/opportunitycustomobjectinstance1-data.txt");
        entityFiles.put(OpportunityCustomObjectInstance2.class, "customobjectinstances/opportunitycustomobjectinstance2-data.txt");
        entityFiles.put(OpportunityCustomObjectInstance3.class, "customobjectinstances/opportunitycustomobjectinstance3-data.txt");
        entityFiles.put(OpportunityCustomObjectInstance4.class, "customobjectinstances/opportunitycustomobjectinstance4-data.txt");
        entityFiles.put(OpportunityCustomObjectInstance5.class, "customobjectinstances/opportunitycustomobjectinstance5-data.txt");
        entityFiles.put(OpportunityCustomObjectInstance6.class, "customobjectinstances/opportunitycustomobjectinstance6-data.txt");
        entityFiles.put(OpportunityCustomObjectInstance7.class, "customobjectinstances/opportunitycustomobjectinstance7-data.txt");
        entityFiles.put(OpportunityCustomObjectInstance8.class, "customobjectinstances/opportunitycustomobjectinstance8-data.txt");
        entityFiles.put(OpportunityCustomObjectInstance9.class, "customobjectinstances/opportunitycustomobjectinstance9-data.txt");
        entityFiles.put(OpportunityCustomObjectInstance10.class, "customobjectinstances/opportunitycustomobjectinstance10-data.txt");
        entityFiles.put(PlacementCustomObjectInstance1.class, "customobjectinstances/placementcustomobjectinstance1-data.txt");
        entityFiles.put(PlacementCustomObjectInstance2.class, "customobjectinstances/placementcustomobjectinstance2-data.txt");
        entityFiles.put(PlacementCustomObjectInstance3.class, "customobjectinstances/placementcustomobjectinstance3-data.txt");
        entityFiles.put(PlacementCustomObjectInstance4.class, "customobjectinstances/placementcustomobjectinstance4-data.txt");
        entityFiles.put(PlacementCustomObjectInstance5.class, "customobjectinstances/placementcustomobjectinstance5-data.txt");
        entityFiles.put(PlacementCustomObjectInstance6.class, "customobjectinstances/placementcustomobjectinstance6-data.txt");
        entityFiles.put(PlacementCustomObjectInstance7.class, "customobjectinstances/placementcustomobjectinstance7-data.txt");
        entityFiles.put(PlacementCustomObjectInstance8.class, "customobjectinstances/placementcustomobjectinstance8-data.txt");
        entityFiles.put(PlacementCustomObjectInstance9.class, "customobjectinstances/placementcustomobjectinstance9-data.txt");
        entityFiles.put(PlacementCustomObjectInstance10.class, "customobjectinstances/placementcustomobjectinstance10-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance1.class, "customobjectinstances/clientcorporationcustomobjectinstance1-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance2.class, "customobjectinstances/clientcorporationcustomobjectinstance2-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance3.class, "customobjectinstances/clientcorporationcustomobjectinstance3-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance4.class, "customobjectinstances/clientcorporationcustomobjectinstance4-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance5.class, "customobjectinstances/clientcorporationcustomobjectinstance5-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance6.class, "customobjectinstances/clientcorporationcustomobjectinstance6-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance7.class, "customobjectinstances/clientcorporationcustomobjectinstance7-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance8.class, "customobjectinstances/clientcorporationcustomobjectinstance8-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance9.class, "customobjectinstances/clientcorporationcustomobjectinstance9-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance10.class, "customobjectinstances/clientcorporationcustomobjectinstance10-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance11.class, "customobjectinstances/clientcorporationcustomobjectinstance11-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance12.class, "customobjectinstances/clientcorporationcustomobjectinstance12-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance13.class, "customobjectinstances/clientcorporationcustomobjectinstance13-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance14.class, "customobjectinstances/clientcorporationcustomobjectinstance14-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance15.class, "customobjectinstances/clientcorporationcustomobjectinstance15-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance16.class, "customobjectinstances/clientcorporationcustomobjectinstance16-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance17.class, "customobjectinstances/clientcorporationcustomobjectinstance17-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance18.class, "customobjectinstances/clientcorporationcustomobjectinstance18-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance19.class, "customobjectinstances/clientcorporationcustomobjectinstance19-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance20.class, "customobjectinstances/clientcorporationcustomobjectinstance20-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance21.class, "customobjectinstances/clientcorporationcustomobjectinstance20-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance22.class, "customobjectinstances/clientcorporationcustomobjectinstance20-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance23.class, "customobjectinstances/clientcorporationcustomobjectinstance20-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance24.class, "customobjectinstances/clientcorporationcustomobjectinstance20-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance25.class, "customobjectinstances/clientcorporationcustomobjectinstance20-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance26.class, "customobjectinstances/clientcorporationcustomobjectinstance20-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance27.class, "customobjectinstances/clientcorporationcustomobjectinstance20-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance28.class, "customobjectinstances/clientcorporationcustomobjectinstance20-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance29.class, "customobjectinstances/clientcorporationcustomobjectinstance20-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance30.class, "customobjectinstances/clientcorporationcustomobjectinstance20-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance31.class, "customobjectinstances/clientcorporationcustomobjectinstance20-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance32.class, "customobjectinstances/clientcorporationcustomobjectinstance20-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance33.class, "customobjectinstances/clientcorporationcustomobjectinstance20-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance34.class, "customobjectinstances/clientcorporationcustomobjectinstance20-data.txt");
        entityFiles.put(ClientCorporationCustomObjectInstance35.class, "customobjectinstances/clientcorporationcustomobjectinstance20-data.txt");
        entityFiles.put(PersonCustomObjectInstance1.class, "customobjectinstances/personcustomobjectinstance1-data.txt");
        entityFiles.put(PersonCustomObjectInstance2.class, "customobjectinstances/personcustomobjectinstance2-data.txt");
        entityFiles.put(PersonCustomObjectInstance3.class, "customobjectinstances/personcustomobjectinstance3-data.txt");
        entityFiles.put(PersonCustomObjectInstance4.class, "customobjectinstances/personcustomobjectinstance4-data.txt");
        entityFiles.put(PersonCustomObjectInstance5.class, "customobjectinstances/personcustomobjectinstance5-data.txt");
        entityFiles.put(PersonCustomObjectInstance6.class, "customobjectinstances/personcustomobjectinstance6-data.txt");
        entityFiles.put(PersonCustomObjectInstance7.class, "customobjectinstances/personcustomobjectinstance7-data.txt");
        entityFiles.put(PersonCustomObjectInstance8.class, "customobjectinstances/personcustomobjectinstance8-data.txt");
        entityFiles.put(PersonCustomObjectInstance9.class, "customobjectinstances/personcustomobjectinstance9-data.txt");
        entityFiles.put(PersonCustomObjectInstance10.class, "customobjectinstances/personcustomobjectinstance10-data.txt");

        entityFiles.put(CandidateFileAttachment.class, "file/candidatefileattachment-data.txt");
        entityFiles.put(ClientContactFileAttachment.class, "file/clientcontactfileattachment-data.txt");
        entityFiles.put(ClientCorporationFileAttachment.class, "file/clientcorporationfileattachment-data.txt");
        entityFiles.put(JobOrderFileAttachment.class, "file/joborderfileattachment-data.txt");
        entityFiles.put(OpportunityFileAttachment.class, "file/opportunityfileattachment-data.txt");
        entityFiles.put(PlacementFileAttachment.class, "file/placementfileattachment-data.txt");

        entityFiles.put(ClientCorporationCustomObject.class, "customobject/clientcorporationcustomobject-data.txt");
        entityFiles.put(JobOrderCustomObject.class, "customobject/jobordercustomobject-data.txt");
        entityFiles.put(PlacementCustomObject.class, "customobject/placementcustomobject-data.txt");
        entityFiles.put(UserCustomObject.class, "customobject/usercustomobject-data.txt");

        return entityFiles;
    }

    public static Map<Class<? extends BullhornEntity>, String> getMetaDataFileNames() {
        Map<Class<? extends BullhornEntity>, String> entityMetaFiles = new LinkedHashMap<Class<? extends BullhornEntity>, String>();

        entityMetaFiles.put(Appointment.class, "meta/appointment-meta-data.txt");
        entityMetaFiles.put(AppointmentAttendee.class, "meta/appointmentattendee-meta-data.txt");
        entityMetaFiles.put(Branch.class, "meta/branch-meta-data.txt");
        entityMetaFiles.put(BusinessSector.class, "meta/businesssector-meta-data.txt");
        entityMetaFiles.put(Candidate.class, "meta/candidate-meta-data.txt");
        entityMetaFiles.put(CandidateCertification.class, "meta/candidatecertification-meta-data.txt");
        entityMetaFiles.put(CandidateEducation.class, "meta/candidateeducation-meta-data.txt");
        entityMetaFiles.put(CandidateReference.class, "meta/candidatereference-meta-data.txt");
        entityMetaFiles.put(CandidateWorkHistory.class, "meta/candidateworkhistory-meta-data.txt");
        entityMetaFiles.put(Category.class, "meta/category-meta-data.txt");
        entityMetaFiles.put(Certification.class, "meta/certification-meta-data.txt");
        entityMetaFiles.put(CertificationGroup.class, "meta/certificationgroup-meta-data.txt");
        entityMetaFiles.put(ClientContact.class, "meta/clientcontact-meta-data.txt");
        entityMetaFiles.put(ClientCorporation.class, "meta/clientcorporation-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCertification.class, "meta/clientcorporationcertification-meta-data.txt");
        entityMetaFiles.put(CorporateUser.class, "meta/corporateuser-meta-data.txt");
        entityMetaFiles.put(CorporationDepartment.class, "meta/corporationdepartment-meta-data.txt");
        entityMetaFiles.put(Country.class, "meta/country-meta-data.txt");
        entityMetaFiles.put(Department.class, "meta/department-meta-data.txt");
        entityMetaFiles.put(DistributionList.class, "meta/distributionlist-meta-data.txt");
        entityMetaFiles.put(File.class, "meta/file-meta-data.txt");
        entityMetaFiles.put(HousingComplex.class, "meta/housingcomplex-meta-data.txt");
        entityMetaFiles.put(HousingComplexUnit.class, "meta/housingcomplexunit-meta-data.txt");
        entityMetaFiles.put(HousingComplexFurnitureDelivery.class, "meta/housingcomplexfurnituredelivery-meta-data.txt");
        entityMetaFiles.put(HousingComplexUtilityAccount.class, "meta/housingcomplexutilityaccount-meta-data.txt");
        entityMetaFiles.put(UserHousingComplexUnit.class, "meta/userhousingcomplexunit-meta-data.txt");
        entityMetaFiles.put(JobBoardPost.class, "meta/jobboardpost-meta-data.txt");
        entityMetaFiles.put(JobOrder.class, "meta/joborder-meta-data.txt");
        entityMetaFiles.put(JobSubmission.class, "meta/jobsubmission-meta-data.txt");
        entityMetaFiles.put(JobSubmissionHistory.class, "meta/jobsubmissionhistory-meta-data.txt");
        entityMetaFiles.put(Lead.class, "meta/lead-meta-data.txt");
        entityMetaFiles.put(Note.class, "meta/note-meta-data.txt");
        entityMetaFiles.put(NoteEntity.class, "meta/noteentity-meta-data.txt");
        entityMetaFiles.put(Opportunity.class, "meta/opportunity-meta-data.txt");
        entityMetaFiles.put(Person.class, "meta/person-meta-data.txt");
        entityMetaFiles.put(Placement.class, "meta/placement-meta-data.txt");
        entityMetaFiles.put(PlacementCertification.class, "meta/placementcertification-meta-data.txt");
        entityMetaFiles.put(PlacementChangeRequest.class, "meta/placementchangerequest-meta-data.txt");
        entityMetaFiles.put(PlacementCommission.class, "meta/placementcommission-meta-data.txt");
        entityMetaFiles.put(PrivateLabel.class, "meta/privatelabel-meta-data.txt");
        entityMetaFiles.put(Sendout.class, "meta/sendout-meta-data.txt");
        entityMetaFiles.put(Skill.class, "meta/skill-meta-data.txt");
        entityMetaFiles.put(Specialty.class, "meta/specialty-meta-data.txt");
        entityMetaFiles.put(State.class, "meta/state-meta-data.txt");
        entityMetaFiles.put(Task.class, "meta/task-meta-data.txt");
        entityMetaFiles.put(TimeUnit.class, "meta/timeunit-meta-data.txt");
        entityMetaFiles.put(UserType.class, "meta/usertype-meta-data.txt");
        entityMetaFiles.put(WorkersCompensation.class, "meta/workerscompensation-meta-data.txt");
        entityMetaFiles.put(WorkersCompensationRate.class, "meta/workerscompensationrate-meta-data.txt");

        entityMetaFiles.put(JobOrderCustomObjectInstance1.class, "meta/customobjectinstances/jobordercustomobjectinstance1-meta-data.txt");
        entityMetaFiles.put(JobOrderCustomObjectInstance2.class, "meta/customobjectinstances/jobordercustomobjectinstance2-meta-data.txt");
        entityMetaFiles.put(JobOrderCustomObjectInstance3.class, "meta/customobjectinstances/jobordercustomobjectinstance3-meta-data.txt");
        entityMetaFiles.put(JobOrderCustomObjectInstance4.class, "meta/customobjectinstances/jobordercustomobjectinstance4-meta-data.txt");
        entityMetaFiles.put(JobOrderCustomObjectInstance5.class, "meta/customobjectinstances/jobordercustomobjectinstance5-meta-data.txt");
        entityMetaFiles.put(JobOrderCustomObjectInstance6.class, "meta/customobjectinstances/jobordercustomobjectinstance6-meta-data.txt");
        entityMetaFiles.put(JobOrderCustomObjectInstance7.class, "meta/customobjectinstances/jobordercustomobjectinstance7-meta-data.txt");
        entityMetaFiles.put(JobOrderCustomObjectInstance8.class, "meta/customobjectinstances/jobordercustomobjectinstance8-meta-data.txt");
        entityMetaFiles.put(JobOrderCustomObjectInstance9.class, "meta/customobjectinstances/jobordercustomobjectinstance9-meta-data.txt");
        entityMetaFiles.put(JobOrderCustomObjectInstance10.class, "meta/customobjectinstances/jobordercustomobjectinstance10-meta-data.txt");
        entityMetaFiles.put(OpportunityCustomObjectInstance1.class, "meta/customobjectinstances/opportunitycustomobjectinstance1-meta-data.txt");
        entityMetaFiles.put(OpportunityCustomObjectInstance2.class, "meta/customobjectinstances/opportunitycustomobjectinstance2-meta-data.txt");
        entityMetaFiles.put(OpportunityCustomObjectInstance3.class, "meta/customobjectinstances/opportunitycustomobjectinstance3-meta-data.txt");
        entityMetaFiles.put(OpportunityCustomObjectInstance4.class, "meta/customobjectinstances/opportunitycustomobjectinstance4-meta-data.txt");
        entityMetaFiles.put(OpportunityCustomObjectInstance5.class, "meta/customobjectinstances/opportunitycustomobjectinstance5-meta-data.txt");
        entityMetaFiles.put(OpportunityCustomObjectInstance6.class, "meta/customobjectinstances/opportunitycustomobjectinstance6-meta-data.txt");
        entityMetaFiles.put(OpportunityCustomObjectInstance7.class, "meta/customobjectinstances/opportunitycustomobjectinstance7-meta-data.txt");
        entityMetaFiles.put(OpportunityCustomObjectInstance8.class, "meta/customobjectinstances/opportunitycustomobjectinstance8-meta-data.txt");
        entityMetaFiles.put(OpportunityCustomObjectInstance9.class, "meta/customobjectinstances/opportunitycustomobjectinstance9-meta-data.txt");
        entityMetaFiles.put(OpportunityCustomObjectInstance10.class, "meta/customobjectinstances/opportunitycustomobjectinstance10-meta-data.txt");
        entityMetaFiles.put(PlacementCustomObjectInstance1.class, "meta/customobjectinstances/placementcustomobjectinstance1-meta-data.txt");
        entityMetaFiles.put(PlacementCustomObjectInstance2.class, "meta/customobjectinstances/placementcustomobjectinstance2-meta-data.txt");
        entityMetaFiles.put(PlacementCustomObjectInstance3.class, "meta/customobjectinstances/placementcustomobjectinstance3-meta-data.txt");
        entityMetaFiles.put(PlacementCustomObjectInstance4.class, "meta/customobjectinstances/placementcustomobjectinstance4-meta-data.txt");
        entityMetaFiles.put(PlacementCustomObjectInstance5.class, "meta/customobjectinstances/placementcustomobjectinstance5-meta-data.txt");
        entityMetaFiles.put(PlacementCustomObjectInstance6.class, "meta/customobjectinstances/placementcustomobjectinstance6-meta-data.txt");
        entityMetaFiles.put(PlacementCustomObjectInstance7.class, "meta/customobjectinstances/placementcustomobjectinstance7-meta-data.txt");
        entityMetaFiles.put(PlacementCustomObjectInstance8.class, "meta/customobjectinstances/placementcustomobjectinstance8-meta-data.txt");
        entityMetaFiles.put(PlacementCustomObjectInstance9.class, "meta/customobjectinstances/placementcustomobjectinstance9-meta-data.txt");
        entityMetaFiles.put(PlacementCustomObjectInstance10.class, "meta/customobjectinstances/placementcustomobjectinstance10-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance1.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance1-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance2.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance2-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance3.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance3-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance4.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance4-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance5.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance5-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance6.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance6-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance7.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance7-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance8.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance8-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance9.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance9-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance10.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance10-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance11.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance11-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance12.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance12-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance13.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance13-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance14.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance14-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance15.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance15-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance16.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance16-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance17.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance17-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance18.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance18-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance19.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance19-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance20.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance20-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance21.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance21-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance22.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance22-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance23.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance23-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance24.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance24-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance25.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance25-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance26.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance26-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance27.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance27-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance28.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance28-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance29.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance29-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance30.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance30-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance31.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance31-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance32.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance32-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance33.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance33-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance34.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance34-meta-data.txt");
        entityMetaFiles.put(ClientCorporationCustomObjectInstance35.class, "meta/customobjectinstances/clientcorporationcustomobjectinstance35-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance1.class, "meta/customobjectinstances/personcustomobjectinstance1-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance2.class, "meta/customobjectinstances/personcustomobjectinstance2-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance3.class, "meta/customobjectinstances/personcustomobjectinstance3-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance4.class, "meta/customobjectinstances/personcustomobjectinstance4-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance5.class, "meta/customobjectinstances/personcustomobjectinstance5-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance6.class, "meta/customobjectinstances/personcustomobjectinstance6-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance7.class, "meta/customobjectinstances/personcustomobjectinstance7-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance8.class, "meta/customobjectinstances/personcustomobjectinstance8-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance9.class, "meta/customobjectinstances/personcustomobjectinstance9-meta-data.txt");
        entityMetaFiles.put(PersonCustomObjectInstance10.class, "meta/customobjectinstances/personcustomobjectinstance10-meta-data.txt");

        entityMetaFiles.put(ClientCorporationCustomObject.class, "meta/customobject/clientcorporationcustomobject-meta-data.txt");
        entityMetaFiles.put(JobOrderCustomObject.class, "meta/customobject/jobordercustomobject-meta-data.txt");
        entityMetaFiles.put(PlacementCustomObject.class, "meta/customobject/placementcustomobject-meta-data.txt");
        entityMetaFiles.put(UserCustomObject.class, "meta/customobject/usercustomobject-meta-data.txt");

        return entityMetaFiles;
    }

    public static Map<Class<? extends SearchEntity>, String> getSearchFieldFileNames() {
        Map<Class<? extends SearchEntity>, String> searchFieldsFiles = new LinkedHashMap<Class<? extends SearchEntity>, String>();

        searchFieldsFiles.put(Candidate.class, "searchfields/candidate-searchfields.txt");
        searchFieldsFiles.put(ClientContact.class, "searchfields/clientcontact-searchfields.txt");
        searchFieldsFiles.put(ClientCorporation.class, "searchfields/clientcorporation-searchfields.txt");
        searchFieldsFiles.put(JobOrder.class, "searchfields/joborder-searchfields.txt");
        searchFieldsFiles.put(JobSubmission.class, "searchfields/jobsubmission-searchfields.txt");
        searchFieldsFiles.put(Lead.class, "searchfields/lead-searchfields.txt");
        searchFieldsFiles.put(Person.class, "searchfields/person-searchfields.txt");
        searchFieldsFiles.put(Note.class, "searchfields/note-searchfields.txt");
        searchFieldsFiles.put(Opportunity.class, "searchfields/opportunity-searchfields.txt");
        searchFieldsFiles.put(Placement.class, "searchfields/placement-searchfields.txt");

        return searchFieldsFiles;
    }

}
