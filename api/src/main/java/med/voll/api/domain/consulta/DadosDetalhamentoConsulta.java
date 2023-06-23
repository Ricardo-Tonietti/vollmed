package med.voll.api.domain.consulta;

import java.time.LocalDateTime;

public record DadosDetalhamentoConsulta(Long id , Long medicoId, Long pacienteId, LocalDateTime data) {
    public DadosDetalhamentoConsulta(Consulta consulta) {
        this(consulta.getId(), consulta.getMedico().getId(),consulta.getPaciente().getId(),consulta.getData());
    }
}
