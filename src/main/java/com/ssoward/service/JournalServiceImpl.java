package com.ssoward.service;

import com.ssoward.model.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by ssoward on 11/22/14.
 */

@Service
public class JournalServiceImpl implements JournalService{
    @Autowired
    NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    EntryService entryService;

    @Override
    public Page getPage(Long id) {
        return null;
    }

    RowMapper<Page> pageRowMapper = new RowMapper<Page>() {
        public Page mapRow(ResultSet rs, int i) throws SQLException {
            Page p = new Page();
//            prop.setId(rs.getLong("bl_proposal_id"));
//            prop.setOwningUnitNumber(rs.getLong("owning_unit_number"));
//            prop.setType(ProposalType.get(rs.getInt("bl_proposal_type_id")));
//            prop.setSubmittedByCmisId(rs.getLong("submitted_by_cmis_id"));
//            String yn = rs.getString("APPROVED_YN_FLAG");
//            prop.setApprovalDecision(yn!=null?("Y".equals(yn)?true:false):null);
//            prop.setStatus(ProposalStatus.getForId(rs.getLong("BL_PROPOSAL_STATUS_ID")));
//            prop.setReturnedDate(BLUtils.convertDateToDisplayString(rs.getDate("returned_dt")));
//            prop.setWithdrawnDate(BLUtils.convertDateToDisplayString(rs.getDate("withdrawn_dt")));
//            prop.setResubmittedDate(BLUtils.convertDateToDisplayString(rs.getDate("resubmitted_dt")));
//            try{prop.setArchivedDate(BLUtils.convertDateToDisplayString(rs.getDate("archived_dt")));}catch(SQLException e){/*did not select archive date*/}
//
//            if (rs.wasNull()) {
//                prop.setSubmittedByCmisId(null);
//            }
//
//            prop.setSubmittedByName(rs.getString("submitted_by_nm"));
//            prop.setSubmittedDate(BLUtils.convertDateToDisplayString(rs.getTimestamp("submitted_dt")));

            return p;
        }
    };

    @Override
    public List<Page> getUserPages() {
        MapSqlParameterSource params = new MapSqlParameterSource("id", entryService.getLoggedInUser().getId());
        String sql = "select * from pages g where g.user_id = :id";
        List<Page> pageList = jdbcTemplate.query(sql, params, pageRowMapper);
        return pageList;
    }

    @Override
    public void savePage(Page page) {

    }

    @Override
    public void deletePage(Long pageId) {

    }
}
